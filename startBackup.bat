cd\

set "CatchFirstArg=%1"
echo.%CatchFirstArg%

set "CatchSecondArg=%2"
echo.%CatchSecondArg%


set "CatchThirdArg=%3"
echo.%CatchThirdArg%

set "SetArgumentsDateTime=%CatchFirstArg%_%CatchSecondArg%_%CatchThirdArg%_%date%_%time%"
echo.%SetArgumentsDateTime%



SET src_folder=C:\MyLatestDir
SET tar_folder=C:\MyLatestDirBackup

xcopy %src_folder% %tar_folder% /s /e

rmdir %src_folder% /s /q

mkdir %src_folder%

pause

exit