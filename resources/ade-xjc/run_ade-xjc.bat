@if "%DEBUG%" == "" @echo off
@rem #######################################################
@rem
@rem  Windows start script for converting the Quality ADE
@rem
@rem #######################################################

set OUTPUT="src-gen"
set BINDING="binding.xjb"
set SCHEMA="qualityAde.xsd"
set PLUGINS="-Xnamespace-prefix"

call ..\ade-xjc.bat %PLUGINS% -clean -output %OUTPUT% -binding %BINDING% %SCHEMA%