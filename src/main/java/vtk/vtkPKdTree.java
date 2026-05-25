// java wrapper for vtkPKdTree object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPKdTree extends vtkKdTree
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void BuildLocator_4();
  public void BuildLocator()
  {
    BuildLocator_4();
  }

  private native long GetTotalNumberOfCells_5();
  public long GetTotalNumberOfCells()
  {
    return GetTotalNumberOfCells_5();
  }

  private native int CreateProcessCellCountData_6();
  public int CreateProcessCellCountData()
  {
    return CreateProcessCellCountData_6();
  }

  private native int CreateGlobalDataArrayBounds_7();
  public int CreateGlobalDataArrayBounds()
  {
    return CreateGlobalDataArrayBounds_7();
  }

  private native void SetController_8(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_8(id0);
  }

  private native long GetController_9();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_9();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetRegionAssignment_10();
  public int GetRegionAssignment()
  {
    return GetRegionAssignment_10();
  }

  private native int AssignRegionsRoundRobin_11();
  public int AssignRegionsRoundRobin()
  {
    return AssignRegionsRoundRobin_11();
  }

  private native int AssignRegionsContiguous_12();
  public int AssignRegionsContiguous()
  {
    return AssignRegionsContiguous_12();
  }

  private native int GetRegionAssignmentMapLength_13();
  public int GetRegionAssignmentMapLength()
  {
    return GetRegionAssignmentMapLength_13();
  }

  private native int GetRegionAssignmentList_14(int id0,vtkIntArray id1);
  public int GetRegionAssignmentList(int id0,vtkIntArray id1)
  {
    return GetRegionAssignmentList_14(id0,id1);
  }

  private native void GetAllProcessesBorderingOnPoint_15(float id0,float id1,float id2,vtkIntArray id3);
  public void GetAllProcessesBorderingOnPoint(float id0,float id1,float id2,vtkIntArray id3)
  {
    GetAllProcessesBorderingOnPoint_15(id0,id1,id2,id3);
  }

  private native int GetProcessAssignedToRegion_16(int id0);
  public int GetProcessAssignedToRegion(int id0)
  {
    return GetProcessAssignedToRegion_16(id0);
  }

  private native int HasData_17(int id0,int id1);
  public int HasData(int id0,int id1)
  {
    return HasData_17(id0,id1);
  }

  private native int GetProcessCellCountForRegion_18(int id0,int id1);
  public int GetProcessCellCountForRegion(int id0,int id1)
  {
    return GetProcessCellCountForRegion_18(id0,id1);
  }

  private native int GetTotalProcessesInRegion_19(int id0);
  public int GetTotalProcessesInRegion(int id0)
  {
    return GetTotalProcessesInRegion_19(id0);
  }

  private native int GetProcessListForRegion_20(int id0,vtkIntArray id1);
  public int GetProcessListForRegion(int id0,vtkIntArray id1)
  {
    return GetProcessListForRegion_20(id0,id1);
  }

  private native int GetTotalRegionsForProcess_21(int id0);
  public int GetTotalRegionsForProcess(int id0)
  {
    return GetTotalRegionsForProcess_21(id0);
  }

  private native int GetRegionListForProcess_22(int id0,vtkIntArray id1);
  public int GetRegionListForProcess(int id0,vtkIntArray id1)
  {
    return GetRegionListForProcess_22(id0,id1);
  }

  private native long GetCellListsForProcessRegions_23(int id0,int id1,vtkIdList id2,vtkIdList id3);
  public long GetCellListsForProcessRegions(int id0,int id1,vtkIdList id2,vtkIdList id3)
  {
    return GetCellListsForProcessRegions_23(id0,id1,id2,id3);
  }

  private native long GetCellListsForProcessRegions_24(int id0,vtkDataSet id1,vtkIdList id2,vtkIdList id3);
  public long GetCellListsForProcessRegions(int id0,vtkDataSet id1,vtkIdList id2,vtkIdList id3)
  {
    return GetCellListsForProcessRegions_24(id0,id1,id2,id3);
  }

  private native long GetCellListsForProcessRegions_25(int id0,vtkIdList id1,vtkIdList id2);
  public long GetCellListsForProcessRegions(int id0,vtkIdList id1,vtkIdList id2)
  {
    return GetCellListsForProcessRegions_25(id0,id1,id2);
  }

  private native int ViewOrderAllProcessesInDirection_26(double id0[],vtkIntArray id1);
  public int ViewOrderAllProcessesInDirection(double id0[],vtkIntArray id1)
  {
    return ViewOrderAllProcessesInDirection_26(id0,id1);
  }

  private native int ViewOrderAllProcessesFromPosition_27(double id0[],vtkIntArray id1);
  public int ViewOrderAllProcessesFromPosition(double id0[],vtkIntArray id1)
  {
    return ViewOrderAllProcessesFromPosition_27(id0,id1);
  }

  private native int GetCellArrayGlobalRange_28(byte[] id0, int len0,float id1[]);
  public int GetCellArrayGlobalRange(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayGlobalRange_28(bytes0, bytes0.length,id1);
  }

  private native int GetPointArrayGlobalRange_29(byte[] id0, int len0,float id1[]);
  public int GetPointArrayGlobalRange(String id0,float id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayGlobalRange_29(bytes0, bytes0.length,id1);
  }

  private native int GetCellArrayGlobalRange_30(byte[] id0, int len0,double id1[]);
  public int GetCellArrayGlobalRange(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayGlobalRange_30(bytes0, bytes0.length,id1);
  }

  private native int GetPointArrayGlobalRange_31(byte[] id0, int len0,double id1[]);
  public int GetPointArrayGlobalRange(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayGlobalRange_31(bytes0, bytes0.length,id1);
  }

  private native int GetCellArrayGlobalRange_32(int id0,double id1[]);
  public int GetCellArrayGlobalRange(int id0,double id1[])
  {
    return GetCellArrayGlobalRange_32(id0,id1);
  }

  private native int GetPointArrayGlobalRange_33(int id0,double id1[]);
  public int GetPointArrayGlobalRange(int id0,double id1[])
  {
    return GetPointArrayGlobalRange_33(id0,id1);
  }

  private native int GetCellArrayGlobalRange_34(int id0,float id1[]);
  public int GetCellArrayGlobalRange(int id0,float id1[])
  {
    return GetCellArrayGlobalRange_34(id0,id1);
  }

  private native int GetPointArrayGlobalRange_35(int id0,float id1[]);
  public int GetPointArrayGlobalRange(int id0,float id1[])
  {
    return GetPointArrayGlobalRange_35(id0,id1);
  }

  public vtkPKdTree() { super(); }

  public vtkPKdTree(long id) { super(id); }
  public native long   VTKInit();

}
