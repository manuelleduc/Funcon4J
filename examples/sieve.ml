let rec filter f = function
    | [] -> []
    | [h::t] ->
        if (f h) then h :: (filter f t)
        else (filter f t);;

let succ n = n + 1;;

let rec interval min max =
    if min > max then []
    else min :: (interval (succ min) max);;

let remove_multiples_of n =
    filter (fun m -> m mod n <> 0);;

let sieve max =
    let rec filter_again = function
            | [] -> []
            | [n :: r] as l ->
                if n * n > max then l
                else n :: (filter_again (remove_multiples_of n r))
    in
        filter_again (interval 2 max);;

sieve 100;;