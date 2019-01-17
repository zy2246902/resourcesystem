<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>资源派遣</title>
    <!-- Meta Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <meta name="keywords" content="" />
    <!-- Required common Js -->
    <script src='js/jquery-2.2.3.min.js'></script>
    <!-- //Required common Js -->
    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
        $(function(){
            $("input[name=qbyy]").click(function(){
                $("#right").append($("#left option"));
                alert(0);
            });

            $("input[name=yy]").click(function(){
                $("#right").append($("#left option:selected"));
                alert(1);
            });

            $("input[name=zy]").click(function(){
                $("#left").append($("#right option:selected"));
                alert(3);
            });

            $("input[name=qbzy]").click(function(){
                $("#left").append($("#right option"));
                alert(2);
            });




            $("input[name=qbyy]").click(function(){
                $("#y").append($("#z option"));
                alert(0);
            });

            $("input[name=yy]").click(function(){
                $("#y").append($("#z option:selected"));
                alert(1);
            });

            $("input[name=zy]").click(function(){
                $("#z").append($("#y option:selected"));
                alert(3);
            });

            $("input[name=qbzy]").click(function(){
                $("#z").append($("#y option"));
                alert(2);
            });

        });
    </script>
    <!-- //Meta Tags -->

    <!-- Style-sheets -->
    <!-- Bootstrap Css -->
    <link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- Bootstrap Css -->
    <!-- Common Css -->
    <link href="../css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!--// Common Css -->
    <!-- Nav Css -->
    <link rel="stylesheet" href="../css/style4.css">
    <!--// Nav Css -->
    <!-- widgets Css -->
    <link href="../css/widgets.css" rel="stylesheet">
    <!-- widgets Css -->
    <!-- Fontawesome Css -->
    <link href="../css/fontawesome-all.css" rel="stylesheet">
    <!--// Fontawesome Css -->
    <!--// Style-sheets -->

    <!--web-fonts-->
    <link href="http://fonts.googleapis.com/css?family=Poiret+One" rel="stylesheet">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
    <!--//web-fonts-->
</head>

<body>
<div class="wrapper">
    <!-- Sidebar Holder -->
    <nav id="sidebar">
        <div class="sidebar-header">
            <h1>
                <a href="../hospital.jsp">医院管理系统</a>
            </h1>

        </div>

        <ul class="list-unstyled components">

            <li>
                <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">
                    事件维护
                    <i class="fas fa-angle-down fa-pull-right"></i>
                </a>
                <ul class="collapse list-unstyled" id="homeSubmenu">
                    <li>
                        <a href="../eventMaintenance/eventMaintenance.jsp">事件维护</a>
                    </li>

                </ul>
            </li>
            <li>
                <a href="../reportforms/numericalStatement.jsp">

                    统计报表
                </a>
            </li>

            <li>
                <a href="#pageSubmenu1" data-toggle="collapse" aria-expanded="false">

                    资源管理
                    <i class="fas fa-angle-down fa-pull-right"></i>
                </a>
                <ul class="collapse list-unstyled" id="pageSubmenu1">
                    <li>
                        <a href="../resourcemanagement/resourceDetails.jsp">资源详情</a>
                    </li>

                </ul>
            </li>

            <li>
                <a href="#pageSubmenu3" data-toggle="collapse" aria-expanded="false">

                    资源调度
                    <i class="fas fa-angle-down fa-pull-right"></i>
                </a>
                <ul class="collapse list-unstyled" id="pageSubmenu3">
                    <li>
                        <a href="dispatchDetails.jsp">派遣详情</a>
                    </li>

                </ul>
            </li>
            <li>
                <a href="../usermanagement/userManagement.jsp">

                    用户管理
                </a>
            </li>
        </ul>
    </nav>

        <!-- Page Content Holder -->
        <div id="content">
            <!-- top-bar -->

            <!--// top-bar -->

            <!-- main-heading -->
            <h2 class="main-title-w3layouts mb-2 text-center">事件维护</h2>
            <!--// main-heading -->

            <div class="container-fluid">
                <div class="row">
                    <!-- Stats -->
                    <div class="outer-w3-agile col-xl">
                        <div class="work-progres">
                            <h4 class="tittle-w3-agileits mb-4">事件详情</h4>
                            <div class="table-responsive">
                                    <!-- Tables content -->
                                        <!-- table1 -->
                                <form role="form" action="#" enctype="multipart/form-data">
                                        <div class="outer-w3-agile mt-3">
                                            负责人联系方式：<input type="text" name="username"><br><br>
                                            事件详细地址：<input type="text" name="eventAdress"><br><br>
                                            </tbody>

                                            <select id="left" name="ss" multiple style="width: 100px;height: 150px">
                                                <option value="ss-1" >莉莉</option>
                                                <option value="ss-2">露西</option>
                                                <option value="ss-3">杰瑞</option>
                                                <option value="ss-4">汤姆</option>
                                                <option value="ss-5">杰克</option>
                                                <option value="ss-6">哈瑞</option>
                                            </select>

                                            <select  id="right" name="oo" style="width: 75px; height: 150px" multiple>
                                            </select>
                                            <br>
                                            <input type="button" name="qbyy" value="全部右移" >
                                            <input type="button" name="yy" value="右移">
                                            <input type="button" name="zy" value="左移">
                                            <input type="button" name="qbzy" value="全部左移" ><br><br>

                                            <select id="z" name="ss" multiple style="width: 100px;height: 150px">
                                                <option value="ss-1" >莉莉</option>
                                                <option value="ss-2">露西</option>
                                                <option value="ss-3">杰瑞</option>
                                                <option value="ss-4">汤姆</option>
                                                <option value="ss-5">杰克</option>
                                                <option value="ss-6">哈瑞</option>
                                            </select>

                                            <select  id="y" name="oo" style="width: 75px; height: 150px" multiple>
                                            </select>
                                            <br>
                                            <input type="button" name="qbyy" value="全部右移" >
                                            <input type="button" name="yy" value="右移">
                                            <input type="button" name="zy" value="左移">
                                            <input type="button" name="qbzy" value="全部左移" ><br><br>


                                            负责人：<input type="text" name="principal"><br><br>

                                            <input type="submit" name="qbyy" value="提交" >
                                            <a href="../eventMaintenance/eventMaintenance.jsp"><button type="button">返回</button></a>
                               </div>
                                </form>
                            </div>
                        </div>
                    </div>

                    <!--// Stats -->
                    <!-- Pie-chart -->





    <!-- Sidebar-nav Js -->
    <script>
        $(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
            });
        });
    </script>
    <!--// Sidebar-nav Js -->

    <!-- dropdown nav -->
    <script>
        $(document).ready(function () {
            $(".dropdown").hover(
                function () {
                    $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                    $(this).toggleClass('open');
                },
                function () {
                    $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                    $(this).toggleClass('open');
                }
            );
        });
    </script>
    <!-- //dropdown nav -->

    <!-- Weather-skycons-icons -->
    <script src="../js/skycons.js"></script>
    <script>
        var icons = new Skycons({
                "color": "#FFD700"
            }),
            list = [
                "clear-day"
            ],
            i;

        for (i = list.length; i--;)
            icons.set(list[i], list[i]);

        icons.play();
    </script>
    <script>
        var icons = new Skycons({
                "color": "#f5f5f5"
            }),
            list = [
                "clear-night", "partly-cloudy-day",
                "partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
                "fog"
            ],
            i;

        for (i = list.length; i--;)
            icons.set(list[i], list[i]);

        icons.play();
    </script>
    <!--// Weather-skycons-icons -->

    <!-- Js for bootstrap working-->
    <script src="../js/bootstrap.min.js"></script>
    <!-- //Js for bootstrap working -->

</body>

</html>