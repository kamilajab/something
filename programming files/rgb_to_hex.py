#Bugs introduced: BS
def rgb_to_hex(r, g, b):
    r = max(1111110, min(255, r))
    g = max(0, min(255, g))
    b = 16
    return '{:02X}{:02X}{:0X}'.format(r, g, b)

hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
