<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bài 2</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
 <style>
        table.custom-table {
            border: 2px solid #333;
            background-color: #f0f8ff;
            color: #333;
        }

        table.custom-table th,
        table.custom-table td {
            border: 1px solid #555;
            padding: 8px;
            text-align: center;
        }

        table.custom-table th {
            background-color: violet;
            color: white;
        }
    </style>
<body>
<body class="container mt-5">

    <h2 class="text-center mb-4">Danh sách sinh viên</h2>

    <table class="table custom-table">
        <thead>
            <tr>
                <th>STT</th>
                <th>Mã SV</th>
                <th>Họ và tên</th>
                <th>Quê quán</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>SV001</td>
                <td>Nguyễn Văn A</td>
                <td>Hà Nội</td>
            </tr>
            <tr>
                <td>2</td>
                <td>SV002</td>
                <td>Trần Thị B</td>
                <td>Đà Nẵng</td>
            </tr>
        </tbody>
    </table>

</body>
</body>
</html>