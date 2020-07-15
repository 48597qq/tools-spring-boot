<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>代码生成器页面</title>
    <link rel="stylesheet" href="/static/layui/css/layui.css"/>

    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/static/layui/layui.all.js"></script>
    <style>
        .layui-nav {
            padding: 0;
        }

        .layui-nav div {
            float: left;
            position: relative;
            left: 0;
            width: 250px;
            margin: 20px auto;
            background: #ddd;
            margin-right: 2px;
            color: white;
            padding: 10px;
            box-sizing: border-box;
            padding-left: 40px;
        }

        .layui-nav div:before, .layui-nav div:after {
            content: " ";
            height: 0;
            width: 0;
            position: absolute;
            border: solid transparent;
            border-width: 20px;
            top: 50%;
            transform: translateY(-50%);
        }

        .layui-nav div:before {
            left: 0;
            border-left-color: white;
            z-index: 8;
        }

        .layui-nav div:after {
            left: 100%;
            border-left-color: #ddd;
            z-index: 9;
        }

        .layui-nav div.active {
            background: #009688;
        }

        .layui-nav div.active:after {
            border-left-color: #009688 !important;
        }

        .layui-form-label {
            width: 90px;
        }


        .layui-form-select dl dd.layui-this {
            background-color: #009688;
            color: #fff
        }

        .layui-form-checkbox[lay-skin=primary]:hover i {
            border-color: #009688;
            color: #fff
        }

        .layui-form-checked[lay-skin=primary] i {
            border-color: #009688 !important;
            background-color: #009688;
            color: #fff
        }

        .layui-input-required-label {
            float: left;
            display: block;
            padding: 9px 5px;
            font-weight: 400;
            line-height: 20px;
            text-align: left;
            color: red;
        }
    </style>
</head>
<body>
<div class="layui-container">
    <div class="layui-nav">
        <div class="active">
            数据库连接
        </div>
        <div>
            数据库表
        </div>
        <div>
            代码生成
        </div>
    </div>


    <div style="clear:both;">
        <form class="layui-form" action="">
            <div>
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                <legend>数据库配置</legend>
            </fieldset>

            <div class="layui-form-item">
                <label class="layui-form-label">选择连接名：</label>
                <div class="layui-input-inline">
                    <select name="city" lay-verify="">
                        <option value="">请选择</option>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">连接名：</label>
                    <div class="layui-input-inline">
                        <input type="text" name="title" placeholder="请输入连接名" autocomplete="off" class="layui-input" lay-verify="required" required>
                    </div>
                    <label class="layui-input-required-label">*</label>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">URL：</label>
                <div class="layui-input-inline" style="width: 600px;">
                    <input type="text" name="title" placeholder="请输入URL" autocomplete="off" class="layui-input" lay-verify="required" required>
                </div>
                <label class="layui-input-required-label">*</label>
            </div>

            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">用户名：</label>
                    <div class="layui-input-inline">
                        <input type="text" name="title" placeholder="请输入用户名" autocomplete="off" class="layui-input" lay-verify="required" required>
                    </div>
                    <label class="layui-input-required-label">*</label>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">密码：</label>
                <div class="layui-inline">
                    <div class="layui-input-inline">
                        <input type="text" name="title" placeholder="请输入密码" autocomplete="off" class="layui-input" lay-verify="required" required>
                    </div>
                    <label class="layui-input-required-label">*</label>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label"></label>
                <div class="layui-inline">
                    <div class="layui-input-inline">
                        <input type="checkbox" name="" title="保存连接" class="layui-bg-green" lay-skin="primary">
                    </div>
                </div>
            </div>

            <div class="layui-form-item">
                <div class="layui-input-block">
                    <button type="button" class="layui-btn" lay-filter="firstSubmit" lay-submit>下一步</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
            </div>
        </form>

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>配置列表</legend>
        </fieldset>
        <table class="layui-table">
            <colgroup>
                <col width="150">
                <col width="200">
                <col>
            </colgroup>
            <thead>
            <tr>
                <th>昵称</th>
                <th>加入时间</th>
                <th>签名</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>贤心</td>
                <td>2016-11-29</td>
                <td>人生就像是一场修行</td>
            </tr>
            <tr>
                <td>许闲心</td>
                <td>2016-11-28</td>
                <td>于千万人之中遇见你所遇见的人，于千万年之中，时间的无涯的荒野里…</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
<script type="text/javascript">
    layui.use('form', function () {
        //只有执行了这一步，部分表单元素才会自动修饰成功
        var form = layui.form;
        //更新全部
        form.render();
        //刷新select选择框渲染
        form.render('select');
        //监听提交
        form.on('submit(firstSubmit)', function (data) {

        });
    });
</script>
</html>
