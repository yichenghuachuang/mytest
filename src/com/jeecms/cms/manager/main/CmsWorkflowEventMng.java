package com.jeecms.cms.manager.main;

import java.util.List;
import java.util.Set;

import com.jeecms.cms.entity.main.CmsUser;
import com.jeecms.cms.entity.main.CmsWorkflow;
import com.jeecms.cms.entity.main.CmsWorkflowEvent;

public interface CmsWorkflowEventMng {

	public List<CmsWorkflowEvent> getListByWorkFlowId(Integer workflowId);
	
	public List<CmsWorkflowEvent> getListByUserId(Integer userId);
	
	public CmsWorkflowEvent findById(Integer id);

	public CmsWorkflowEvent find(Integer dataTypeId, Integer dataId);
	
	public CmsWorkflowEvent end(Integer eventId);

	public CmsWorkflowEvent save(CmsWorkflow workflow, CmsUser initiator,
			Set<CmsUser> nextUsers, Integer dateTypeId, Integer dateId,
			Integer step,Boolean hasFinish);

	public CmsWorkflowEvent deleteById(Integer id);
	
	public CmsWorkflowEvent[] deleteByIds(Integer[] ids);
	
	public void deleteByDate(Integer dataTypeId,Integer dataId);
	
}