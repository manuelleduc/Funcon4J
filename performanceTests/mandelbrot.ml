let dbl f = 2. *. f in 
for y = 0 to 400 do
  (print_newline()) ;
  for x = 0 to 400 do
    let cr = (((dbl (float_of_int x)) /. 400.0) -. 1.5) in
    let ci = (((dbl (float_of_int y)) /. 400.0) -. 1.0) in
    let i = ref 1000 in
    let zr = ref 0.0 in
    let zi = ref 0.0 in
    let zr2 = ref 0.0 in
    let zi2 = ref 0.0 in
    while (if (!i) = 0 then ((print_int 1); false) else
           let tr = ((!zr2) -. (!zi2) +. cr) in
           let ti = ((dbl (!zr)) *. (!zi) +. ci) in
           (zr := tr;
           zi := ti;
           zr2 := (!zr) *. (!zr);
           zi2 := (!zi) *. (!zi);
           if ((!zr2) +. (!zi2)) > (2.0 *. 2.0) then ((print_int 0); false) else
           true)) do
      i := (!i) - 1
    done
  done
done;;

(*print_float (Sys.time ());;*)