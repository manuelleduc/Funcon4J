match (1,2) with
    ((2,1)|(1,2)) -> `A`
  | _             -> `B`
;;
(* - : char = `A` *)