<!DOCTYPE html>
<html lang="pl-PL">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="{{ asset('css/panel.css') }}" rel="stylesheet">
    <title>Panel główny</title>
</head>
<body>


    <div id="container">
        <header>
            <div id="color_div"></div>
            <div id="header_content">

                <a href="#">Moje wizyty</a>
                <div id="user_data">
                    <span>Jan Napieralski</span>
                    <img src="./images/profile_picture.jpg" />
                </div>

            </div>
        </header>

        <div id="main_content">
            <div id="left_panel">
                <span class="panel_section">Zakładki</span>
                <div class="panel_link">
                    <img src="./images/calendar.svg"/>
                    <a href="">Umów wizyte</a>
                </div>
                <div class="panel_link">
                    <img src="./images/doctor.svg"/>
                    <a href="">Znajdź lekarza</a>
                </div>
                <div class="panel_link">
                    <img src="./images/checked.svg"/>
                    <a href="">Moje wizyty</a>
                </div>
                <span class="panel_section">Twoi lekarze</span>
                <div class="panel_link">
                    <img src="./images/profile_picture.jpg" />
                    <a href="">Lekarz A</a>
                </div>
                <div class="panel_link">
                    <img src="./images/profile_picture.jpg" />
                    <a href="">Lekarz B</a>
                </div>
            </div>
            <div id="main_panel">
                <div id="visits">
                    <div class="visit">
                        <div class="visit_data">
                            <div class="visit_date">
                                Wizyta z dnia xx.xx.xxxx
                            </div>
                            <div class="visit_doctor">
                                Lekarz A
                            </div>
                        </div>

                        <div class="see_recommendations">
                            <a href="">
                                <span>Zobacz zalecenia</span>
                                <img src="./images/arrow_down.svg" />
                            </a>
                        </div>
                    </div>
                    <div class="visit">
                        <div class="visit_data">
                            <div class="visit_date">
                                Wizyta z dnia xx.xx.xxxx
                            </div>
                            <div class="visit_doctor">
                                Lekarz A
                            </div>
                        </div>

                        <div class="see_recommendations">
                            <a href="">
                                <span>Zobacz zalecenia</span>
                                <img src="./images/arrow-down-svgrepo-com.svg" />
                            </a>
                        </div>
                    </div>
                    <div class="visit">
                        <div class="visit_data">
                            <div class="visit_date">
                                Wizyta z dnia xx.xx.xxxx
                            </div>
                            <div class="visit_doctor">
                                Lekarz A
                            </div>
                        </div>

                        <div class="see_recommendations">
                            <a href="">
                                <span>Zobacz zalecenia</span>
                                <img src="./images/arrow-down-svgrepo-com.svg" />
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <div id="important_data">
                <div class="calnder">
                    <div class="column_right_grid calender">
                        <!-- pop-up-box -->
                        <script type="text/javascript" src="js/modernizr.custom.min.js"></script>    
                        <link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
                        <script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
                        <!-- //pop-up-box -->
                        <script>
                            $(document).ready(function() {
                            $('.popup-with-zoom-anim').magnificPopup({
                                type: 'inline',
                                fixedContentPos: false,
                                fixedBgPos: true,
                                overflowY: 'auto',
                                closeBtnInside: true,
                                preloader: false,
                                midClick: true,
                                removalDelay: 300,
                                mainClass: 'my-mfp-zoom-in'
                            });
                                                                                            
                            });
                        </script>	
                        <div class="cal1">
                            <div class="clndr">
                                <div class="clndr-controls">
                                    <div class="clndr-control-button">
                                        <p class="clndr-previous-button">previous</p>
                                    </div>
                                    <div class="month">SEPTEMBER 2015</div>
                                    <div class="clndr-control-button rightalign">
                                        <p class="clndr-next-button">next</p>
                                    </div>
                                </div>
                                <table class="clndr-table">
                                    <thead>
                                        <tr class="header-days">
                                            <td class="header-day">SUN</td>
                                            <td class="header-day">MON</td>
                                            <td class="header-day">TUE</td>
                                            <td class="header-day">WED</td>
                                            <td class="header-day">THU</td>
                                            <td class="header-day">FRI</td>
                                            <td class="header-day">SAT</td>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="day past adjacent-month last-month calendar-day-2015-04-26"><div class="day-contents">26</div></td>
                                            <td class="day past adjacent-month last-month calendar-day-2015-04-27"><div class="day-contents">27</div></td>
                                            <td class="day past adjacent-month last-month calendar-day-2015-04-28"><div class="day-contents">28</div></td>
                                            <td class="day past adjacent-month last-month calendar-day-2015-04-29"><div class="day-contents">29</div></td>
                                            <td class="day past adjacent-month last-month calendar-day-2015-04-30"><div class="day-contents">30</div></td>
                                            <td class="day past calendar-day-2015-05-01"><div class="day-contents">1</div></td>
                                            <td class="day past calendar-day-2015-05-02"><div class="day-contents">2</div></td>
                                        </tr>
                                        <tr>
                                            <td class="day past calendar-day-2015-05-03"><div class="day-contents">3</div></td>
                                            <td class="day past calendar-day-2015-05-04"><div class="day-contents">4</div></td>
                                            <td class="day past calendar-day-2015-05-05"><div class="day-contents">5</div></td>
                                            <td class="day past calendar-day-2015-05-06"><div class="day-contents">6</div></td>
                                            <td class="day past calendar-day-2015-05-07"><div class="day-contents">7</div></td>
                                            <td class="day past calendar-day-2015-05-08"><div class="day-contents">8</div></td>
                                            <td class="day past calendar-day-2015-05-09"><div class="day-contents">9</div></td>
                                        </tr>
                                        <tr>
                                            <td class="day past event calendar-day-2015-05-10"><div class="day-contents">10</div></td>
                                            <td class="day past event calendar-day-2015-05-11"><div class="day-contents">11</div></td>
                                            <td class="day past event calendar-day-2015-05-12"><div class="day-contents">12</div></td>
                                            <td class="day past event calendar-day-2015-05-13"><div class="day-contents">13</div></td>
                                            <td class="day today event calendar-day-2015-05-14"><div class="day-contents">14</div></td>
                                            <td class="day calendar-day-2015-05-15"><div class="day-contents">15</div></td>
                                            <td class="day calendar-day-2015-05-16"><div class="day-contents">16</div></td>
                                        </tr>
                                        <tr>
                                            <td class="day calendar-day-2015-05-17"><div class="day-contents">17</div></td>
                                            <td class="day calendar-day-2015-05-18"><div class="day-contents">18</div></td>
                                            <td class="day calendar-day-2015-05-19"><div class="day-contents">19</div></td>
                                            <td class="day calendar-day-2015-05-20"><div class="day-contents">20</div></td>
                                            <td class="day event calendar-day-2015-05-21"><div class="day-contents">21</div></td>
                                            <td class="day event calendar-day-2015-05-22"><div class="day-contents">22</div></td>
                                            <td class="day event calendar-day-2015-05-23"><div class="day-contents">23</div></td>
                                        </tr>
                                        <tr>
                                            <td class="day calendar-day-2015-05-24"><div class="day-contents">24</div></td>
                                            <td class="day calendar-day-2015-05-25"><div class="day-contents">25</div></td>
                                            <td class="day calendar-day-2015-05-26"><div class="day-contents">26</div></td>
                                            <td class="day calendar-day-2015-05-27"><div class="day-contents">27</div></td>
                                            <td class="day calendar-day-2015-05-28"><div class="day-contents">28</div></td>
                                            <td class="day calendar-day-2015-05-29"><div class="day-contents">29</div></td>
                                            <td class="day calendar-day-2015-05-30"><div class="day-contents">30</div></td>
                                        </tr>
                                        <tr>
                                            <td class="day calendar-day-2015-05-31"><div class="day-contents">31</div></td>
                                            <td class="day adjacent-month next-month calendar-day-2015-06-01"><div class="day-contents">1</div></td>
                                            <td class="day adjacent-month next-month calendar-day-2015-06-02"><div class="day-contents">2</div></td>
                                            <td class="day adjacent-month next-month calendar-day-2015-06-03"><div class="day-contents">3</div></td>
                                            <td class="day adjacent-month next-month calendar-day-2015-06-04"><div class="day-contents">4</div></td>
                                            <td class="day adjacent-month next-month calendar-day-2015-06-05"><div class="day-contents">5</div></td>
                                            <td class="day adjacent-month next-month calendar-day-2015-06-06"><div class="day-contents">6</div></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>

                <div id="doctor_visits">
                    <div class="visit">
                        <div class="visit_data">
                            <div class="visit_date">
                                Lekarz A wizyta1
                            </div>
                        </div>
                    </div>   
                    <div class="visit">
                        <div class="visit_data">
                            <div class="visit_date">
                                Lekarz A wizyta1
                            </div>
                        </div>
                    </div> 
                    <div class="visit">
                        <div class="visit_data">
                            <div class="visit_date">
                                Lekarz A wizyta1
                            </div>
                        </div>
                    </div>    
                </div>
                
            </div>
        </div>
    </div>
</body>
</html>