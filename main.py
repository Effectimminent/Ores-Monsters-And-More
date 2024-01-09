import os
import re

with open(".git/COMMIT_EDITMSG") as editmsg:
    rev = editmsg.read()
    editmsg.close()
match =re.search('\w+\.\w+\.\w+', rev)
match = match.group(0)
match2 = re.search('\w+\.\w+\.',match)
match2 = match2.group(0)
#print(match2)
final_match = match.replace(match2,"")
final_match = int(final_match)
final_match = final_match + 1
final_match = str(final_match)
match = match2.__add__(final_match)
with open(".git/COMMIT_EDITMSG", 'w') as editmsg:
    editmsg.write(match)
    editmsg.close()
os.system("git commit -a -m "+match)
#print(rev)
#print(match)
#print(match2)
#print(final_match)