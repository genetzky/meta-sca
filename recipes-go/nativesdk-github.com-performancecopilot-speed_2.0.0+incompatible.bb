SUMMARY = "go.mod: github.com/performancecopilot/speed"
HOMEPAGE = "https://pkg.go.dev/github.com/performancecopilot/speed"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-performancecopilot-speed-sources.inc
EXTRA_DEPENDS += "\
    nativesdk-github.com-codahale-hdrhistogram \
    nativesdk-github.com-edsrzf-mmap-go \
    nativesdk-go.uber.org-zap \
"
GO_IMPORT = "github.com/performancecopilot/speed"
inherit gosrc
inherit nativesdk
