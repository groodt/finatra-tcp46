#!/usr/bin/env bash

#
set -eu
set -o pipefail

# Admin works fine
curl -v http://localhost:9990/admin -4
echo
curl -v http://localhost:9990/admin -6
echo

# Custom endpoint fails on tcp6
curl -v http://localhost:9090/ping -4
echo
curl -v http://localhost:9090/ping -6
echo
