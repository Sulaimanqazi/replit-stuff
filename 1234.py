whatFlip = input('Horizontal or Vertical? ')
firstinp = whatFlip[0]
try:
	secondinp = whatFlip[1]
except:
	secondinp = 0
tl = 1
tr = 2
bl = 3
br = 4

if firstinp == 'H':
	a = tl
	b = tr
	c = br
	d = bl
	tl = b
	tr = a
	bl = c
	br = d
if secondinp == 'V':
	blv = bl
	brv = br
	tlv = tl
	trv = tr
	tl = blv
	tr = brv
	bl = tlv
	br = trv
else:
	print()
if firstinp == 'V':
	bla = bl
	bra = br
	tla = tl
	tra = tr
	tl = bla
	tr = bra
	bl = tla
	br = tra
if secondinp == 'H':
	blb = bl
	brb = br
	tlb = tl
	trb = tr
	tl = trb
	tr = tlb
	bl = brb
	br = blb
else: 
	print()

reg = [tl, tr], [bl, br]
for i in reg:
	print(i)