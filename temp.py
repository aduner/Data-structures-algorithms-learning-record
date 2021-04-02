import os
import sys

# 请在此输入您的代码
AB = 52.1
BC = 57.2
CD = 43.5
DE = 51.9
EA = 33.4
EB = 68.2
EC = 71.9
# 三角形ABE
s1 = (AB+EA+EB)/2
A1 = (s1 * (s1-AB) * (s1-EA) * (s1-EB))**(1/2)

s2 = (EB+BC+EC)/2
A2 = (s2 * (s2-EB) * (s2-BC) * (s2-EC))**(1/2)

s3 = (DE+EC+CD)/2
A3 = (s3 * (s3-DE) * (s3-EC) * (s3-CD))**(1/2)

print(round(A1+A2+A3,2))
