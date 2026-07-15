/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let curr = 0; 
    let val = 0; 
    let accum = 0 ;

    if(nums.length == 0){
        return init;
    }

    for(let i = 0 ; i < nums.length ; i++){
          curr = nums[i]
        if(i == 0){
           accum = fn( init , curr );
        }else{
           accum = fn( accum , curr );
        }
       
    }
    val = accum;
    return val;
};