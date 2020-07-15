package org.wengll.tools.code.generator.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wengll.tools.code.generator.entity.DBConfig;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;


@Controller
@RequestMapping("/dbConfig")
public class DBConfigController {
    private static Logger log = LoggerFactory.getLogger(DBConfigController.class);

    @PostMapping("/save")
    public String save(DBConfig config) {
        try {
            getConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "/generator/list";
    }

    private void getConfig() throws IOException {
        // 获取跟目录
        String path = System.getProperty("user.dir");
        ApplicationHome home = new ApplicationHome(getClass());
        File file = home.getSource();
        if (file.exists()) {
            path = file.getAbsolutePath();
            String tagetClasses = "target" + File.separator + "classes";
            if (path.contains(tagetClasses)) {
                path = file.getAbsolutePath().replace(tagetClasses, "");
            }
            tagetClasses += File.separator;
            if (path.contains(tagetClasses)) {
                path = file.getAbsolutePath().replace(tagetClasses, "");
            }

            Path dirPath = Paths.get(path, "config");
            if(Files.notExists(dirPath)){
                Files.createDirectory(dirPath);
                setPermission(dirPath);
            }
            path = dirPath.toString();
        }
        log.info("Config dir is [{}]", path);
    }

    private void setPermission(Path path) throws IOException {
        boolean isPosix = FileSystems.getDefault().supportedFileAttributeViews().contains("posix");
        if (isPosix) {
            Set<PosixFilePermission> perms = new HashSet<>();
            perms.add(PosixFilePermission.OWNER_READ);      //设置所有者的读取权限
            perms.add(PosixFilePermission.OWNER_WRITE);     //设置所有者的写权限
            Files.setPosixFilePermissions(path, perms);
        }
    }
}
