@ECHO OFF
@SET PATH=C:\Users\zhi\Desktop\Applications\curl-7.59.0-win64-mingw\bin;%PATH%
curl -s --insecure ^
	--header "Content-Type: application/json" ^
  	--request GET ^
  https://localhost:8443/stats?username=JohnDoe