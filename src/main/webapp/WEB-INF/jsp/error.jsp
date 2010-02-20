<?xml version="1.0" encoding="UTF-8" ?>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Error</title>
        <style type="text/css">
            td.header { font-weight: bold; text-align: right; }
        </style>
    </head>

    <body>
        <h1>Error</h1>
        <p>
            An error occurred : ${exception.localizedMessage}
        </p>
        <table>
            <tr>
                <td class="header">Handler</td>
                <td>${handler.class.name}</td>
            </tr>
            <tr>
                <td class="header">Request Params</td>
                <td>
                    ${originalRequest.parameterMap}
                </td>
            </tr>
        </table>
    </body>

</html>