class Solution:
    def defangIPaddr(self, address: str) -> str:
        x=""
        for i in range(0,len(address)):
            if(address[i]=="."):
                x=x+"[.]"
                continue
            x=x+address[i]
        return x
