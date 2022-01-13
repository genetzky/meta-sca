SUMMARY = "go.mod: golang.org/x/exp"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/exp"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-exp-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-dmitri.shuralyov.com-gpu-mtl \
    nativesdk-github.com-burntsushi-xgb \
    nativesdk-github.com-go-gl-glfw-v3.3-glfw \
    nativesdk-golang.org-x-image \
    nativesdk-golang.org-x-mobile \
    nativesdk-golang.org-x-mod \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
    nativesdk-golang.org-x-xerrors \
"
GO_IMPORT = "golang.org/x/exp"
# needs GLES3/gl3.h
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
