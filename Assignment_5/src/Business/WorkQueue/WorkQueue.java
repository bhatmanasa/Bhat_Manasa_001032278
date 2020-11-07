/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    public void addWorkRequest(WorkRequest w) {
        workRequestList.add(w);
    }
        public void removeWorkRequest(WorkRequest w) {
        workRequestList.remove(w);
    }
    
        public void updateWorkRequest(WorkRequest w,List<WorkRequest> workList){
            for(WorkRequest work: workList){
                if(work.getOrderNum()  == w.getOrderNum()){
                    work.setMessage(w.getMessage());
                    work.setResolveDate(w.getResolveDate());
                    work.setResult(w.getResult());
                    work.setReceiver(w.getReceiver());
                   work.setStatus(w.getStatus());
                    work.setSender(w.getSender());
                }
            }
        }
        public WorkRequest getWorkRequest(WorkRequest w){
            for(WorkRequest work: workRequestList){
                if(work.getOrderNum()  == w.getOrderNum()){
                    return work;
                }
            }
            return null;
        }
    
}