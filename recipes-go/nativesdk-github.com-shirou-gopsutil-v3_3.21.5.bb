SUMMARY = "go.mod: github.com/shirou/gopsutil/v3"
HOMEPAGE = "https://pkg.go.dev/github.com/shirou/gopsutil/v3"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shirou-gopsutil-v3-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-stackexchange-wmi \
    nativesdk-github.com-tklauser-go-sysconf \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "github.com/shirou/gopsutil/v3"
inherit gosrc
inherit nativesdk
