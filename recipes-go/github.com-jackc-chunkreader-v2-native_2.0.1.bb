SUMMARY = "go.mod: github.com/jackc/chunkreader/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/jackc/chunkreader/v2"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jackc-chunkreader-v2-sources.inc

GO_IMPORT = "github.com/jackc/chunkreader/v2"

inherit gosrc
inherit native
