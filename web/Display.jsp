<%-- 
    Document   : Display
    Created on : 28 Feb 2020, 7:51:06 AM
    Author     : Thabo Diholo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' rel='stylesheet'>
        <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
        <script type='text/javascript' src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js'></script>
        <script type='text/javascript'></script>
        <link rel="stylesheet" href="style.css">

    </head>
    <body>
        <div class="container-fluid">
            <div id="ui-view" data-select2-id="ui-view">
                <div>
                    <div class="card">
                        <div class="card-header">Emp Number:
                            <strong>XXXXXXXXXXXX</strong>
                            <a class="btn btn-sm btn-secondary float-right mr-6 d-print-none" href="#" onclick="javascript:window.print();" data-abc="true">
                                <i class="fa fa-print"></i> Print</a>
                        </div>
                        <div class="card-body">
                            <div class="row mb-4">
                                <div class="col-sm-4">
                                    <h6 class="mb-3">From:</h6>
                                    <div>
                                        <strong>LabourNet.com</strong>
                                    </div>
                                    <div>3 Muswell Road</div>
                                    <div>Bryanston, Sandton, 2191</div>
                                    <div>Email: jhbnorth@labournet.com</div>
                                    <div>Phone: (010) 590 9422</div>
                                </div>
                                <div class="col-sm-4">
                                    <h6 class="mb-3">To:</h6>
                                    <div>
                                        <strong>qwerty@dumy.com</strong>
                                    </div>
                                    <div>42,Lorem Ipsum dolor </div>
                                    <div>Lorem Ipsum dolor, Johannesburg, 12345</div>
                                    <div>Email: qwerty@dumy.com</div>
                                    <div>Phone: +27 730 456 7412</div>
                                </div>
                                <div class="col-sm-4">
                                    <h6 class="mb-3">Details:</h6>
                                    <div>Emp Number:
                                        <strong>XXXXXXXXXXXXXXXXX</strong>
                                    </div>
                                    <div>Feb 28, 2020</div>
                                    <div>Tax : 12345789123</div>
                                    <div>Account Name: 12365478965412</div>
                                    <div>
                                        <strong></strong>
                                    </div>
                                </div>
                            </div>
                            <span class="heading2" style="text-align: center;">
                                Income
                            </span>
                            <div class="table-responsive-sm">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th class="center">#</th>
                                            <th>Description</th>
                                            <th class="center"></th>
                                            <th class="center">Quantity</th>
                                            <th class="right">Rate</th>
                                            <th class="right">Amount</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="center">1</td>
                                            <td class="left">Basic Salary</td>
                                            <td class="left"></td>
                                            <td class="center"></td>
                                            <td class="right"></td>
                                            <td class="right">R${totEarns}</td>
                                        </tr>
                                        <tr>
                                            <td class="center">2</td>
                                            <td class="left">Gross Earning:</td>
                                            <td class="left"></td>
                                            <td class="center"></td>
                                            <td class="right"></td>
                                            <td class="right">R${totEarns}</td>
                                        </tr>

                                    </tbody>
                                </table>
                                <span class="heading2" style="text-align: center;">
                                    Deductions
                                </span>
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th class="center">#</th>
                                            <th class="center">Description</th>  
                                            <th class="center"></th>
                                            <th class="right"></th>
                                            <th class="right"></th>
                                            <th class="right"></th>
                                            <th class="right"></th>
                                            <th class="right">Balance</th>
                                            <th class="right"></th>
                                            <th class="right">Amount</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="center">1</td>
                                            <td class="left">Medical Aid</td>
                                            <td class="left"></td>
                                            <td class="center"></td>
                                            <td class="center"></td>
                                            <td class="right"></td>
                                            <td class="right"></td>
                                            <td class="right"></td>
                                            <td class="right"></td>
                                            <td class="right">R${medAid}</td>
                                        </tr>                                                                      
                                    </tbody>                                    
                                </table>

                            </div>
                            <div class="row">
                                <div class="col-lg-4 col-sm-5"><br><br><br><hr>Signture</div>
                                <div class="col-lg-4 col-sm-5 ml-auto">
                                    <table class="table table-clear">
                                        <tbody>
                                            <tr>
                                                <td class="left">
                                                    <strong>PAYE – before tax credit </strong><br>                                                
                                                    <strong>Monthly </strong><br>
                                                    <strong>Annually</strong>
                                                </td>
                                                <td class="right"><br>R${calcRebate2017}<br>R${annually}</td> 
                                            </tr>
                                            <tr>
                                                <td class="left">
                                                    <strong>Tax Credits </strong>
                                                </td><br>
                                        <td class="right">R${medAid}</td>
                                        </tr>
                                        <tr>
                                            <td class="left">
                                                <strong>PAYE Due – After Tax Credit</strong>
                                            </td>
                                            <td class="right">R${calcRebate2017+medAid}</td>
                                        </tr>
                                        <tr>
                                            <td class="left">
                                                <strong>Net Cash Pay after PAYE Due</strong>
                                            </td>
                                            <td class="right">R${totEarns-medAid-calcRebate2017}</td>
                                        </tr>

                                        </tbody>
                                    </table>
                                    <a class="btn btn-success" href="index.html" data-abc="true">
                                        <i class="fa fa-usd"></i> Back</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
