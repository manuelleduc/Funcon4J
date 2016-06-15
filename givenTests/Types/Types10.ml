let r = ref 0 ;;
(* r : int ref = ref 0 *)

let u = for n = 5 downto 1
        do
          r := n - !r
        done ;;
(* u : unit = () *)

u = () ;;
(* - : bool = true *)

!r ;;
(* - : int = 3 *)
