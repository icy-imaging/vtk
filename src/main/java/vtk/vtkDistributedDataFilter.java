// java wrapper for vtkDistributedDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDistributedDataFilter extends vtkDataObjectAlgorithm
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

  private native void SetController_4(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_4(id0);
  }

  private native long GetController_5();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_5();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKdtree_6();
  public vtkPKdTree GetKdtree()
  {
    long temp = GetKdtree_6();

    if (temp == 0) return null;
    return (vtkPKdTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RetainKdtreeOn_7();
  public void RetainKdtreeOn()
  {
    RetainKdtreeOn_7();
  }

  private native void RetainKdtreeOff_8();
  public void RetainKdtreeOff()
  {
    RetainKdtreeOff_8();
  }

  private native int GetRetainKdtree_9();
  public int GetRetainKdtree()
  {
    return GetRetainKdtree_9();
  }

  private native void SetRetainKdtree_10(int id0);
  public void SetRetainKdtree(int id0)
  {
    SetRetainKdtree_10(id0);
  }

  private native void IncludeAllIntersectingCellsOn_11();
  public void IncludeAllIntersectingCellsOn()
  {
    IncludeAllIntersectingCellsOn_11();
  }

  private native void IncludeAllIntersectingCellsOff_12();
  public void IncludeAllIntersectingCellsOff()
  {
    IncludeAllIntersectingCellsOff_12();
  }

  private native int GetIncludeAllIntersectingCells_13();
  public int GetIncludeAllIntersectingCells()
  {
    return GetIncludeAllIntersectingCells_13();
  }

  private native void SetIncludeAllIntersectingCells_14(int id0);
  public void SetIncludeAllIntersectingCells(int id0)
  {
    SetIncludeAllIntersectingCells_14(id0);
  }

  private native void ClipCellsOn_15();
  public void ClipCellsOn()
  {
    ClipCellsOn_15();
  }

  private native void ClipCellsOff_16();
  public void ClipCellsOff()
  {
    ClipCellsOff_16();
  }

  private native int GetClipCells_17();
  public int GetClipCells()
  {
    return GetClipCells_17();
  }

  private native void SetClipCells_18(int id0);
  public void SetClipCells(int id0)
  {
    SetClipCells_18(id0);
  }

  private native void SetBoundaryMode_19(int id0);
  public void SetBoundaryMode(int id0)
  {
    SetBoundaryMode_19(id0);
  }

  private native void SetBoundaryModeToAssignToOneRegion_20();
  public void SetBoundaryModeToAssignToOneRegion()
  {
    SetBoundaryModeToAssignToOneRegion_20();
  }

  private native void SetBoundaryModeToAssignToAllIntersectingRegions_21();
  public void SetBoundaryModeToAssignToAllIntersectingRegions()
  {
    SetBoundaryModeToAssignToAllIntersectingRegions_21();
  }

  private native void SetBoundaryModeToSplitBoundaryCells_22();
  public void SetBoundaryModeToSplitBoundaryCells()
  {
    SetBoundaryModeToSplitBoundaryCells_22();
  }

  private native int GetBoundaryMode_23();
  public int GetBoundaryMode()
  {
    return GetBoundaryMode_23();
  }

  private native void UseMinimalMemoryOn_24();
  public void UseMinimalMemoryOn()
  {
    UseMinimalMemoryOn_24();
  }

  private native void UseMinimalMemoryOff_25();
  public void UseMinimalMemoryOff()
  {
    UseMinimalMemoryOff_25();
  }

  private native int GetUseMinimalMemory_26();
  public int GetUseMinimalMemory()
  {
    return GetUseMinimalMemory_26();
  }

  private native void SetUseMinimalMemory_27(int id0);
  public void SetUseMinimalMemory(int id0)
  {
    SetUseMinimalMemory_27(id0);
  }

  private native int GetMinimumGhostLevel_28();
  public int GetMinimumGhostLevel()
  {
    return GetMinimumGhostLevel_28();
  }

  private native void SetMinimumGhostLevel_29(int id0);
  public void SetMinimumGhostLevel(int id0)
  {
    SetMinimumGhostLevel_29(id0);
  }

  private native void TimingOn_30();
  public void TimingOn()
  {
    TimingOn_30();
  }

  private native void TimingOff_31();
  public void TimingOff()
  {
    TimingOff_31();
  }

  private native void SetTiming_32(int id0);
  public void SetTiming(int id0)
  {
    SetTiming_32(id0);
  }

  private native int GetTiming_33();
  public int GetTiming()
  {
    return GetTiming_33();
  }

  private native long GetCuts_34();
  public vtkBSPCuts GetCuts()
  {
    long temp = GetCuts_34();

    if (temp == 0) return null;
    return (vtkBSPCuts)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCuts_35(vtkBSPCuts id0);
  public void SetCuts(vtkBSPCuts id0)
  {
    SetCuts_35(id0);
  }

  public vtkDistributedDataFilter() { super(); }

  public vtkDistributedDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
