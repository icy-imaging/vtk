// java wrapper for vtkDataSetSurfaceFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSetSurfaceFilter extends vtkPolyDataAlgorithm
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

  private native void SetPieceInvariant_4(int id0);
  public void SetPieceInvariant(int id0)
  {
    SetPieceInvariant_4(id0);
  }

  private native int GetPieceInvariant_5();
  public int GetPieceInvariant()
  {
    return GetPieceInvariant_5();
  }

  private native void SetPassThroughCellIds_6(int id0);
  public void SetPassThroughCellIds(int id0)
  {
    SetPassThroughCellIds_6(id0);
  }

  private native int GetPassThroughCellIds_7();
  public int GetPassThroughCellIds()
  {
    return GetPassThroughCellIds_7();
  }

  private native void PassThroughCellIdsOn_8();
  public void PassThroughCellIdsOn()
  {
    PassThroughCellIdsOn_8();
  }

  private native void PassThroughCellIdsOff_9();
  public void PassThroughCellIdsOff()
  {
    PassThroughCellIdsOff_9();
  }

  private native void SetPassThroughPointIds_10(int id0);
  public void SetPassThroughPointIds(int id0)
  {
    SetPassThroughPointIds_10(id0);
  }

  private native int GetPassThroughPointIds_11();
  public int GetPassThroughPointIds()
  {
    return GetPassThroughPointIds_11();
  }

  private native void PassThroughPointIdsOn_12();
  public void PassThroughPointIdsOn()
  {
    PassThroughPointIdsOn_12();
  }

  private native void PassThroughPointIdsOff_13();
  public void PassThroughPointIdsOff()
  {
    PassThroughPointIdsOff_13();
  }

  private native void SetFastMode_14(boolean id0);
  public void SetFastMode(boolean id0)
  {
    SetFastMode_14(id0);
  }

  private native boolean GetFastMode_15();
  public boolean GetFastMode()
  {
    return GetFastMode_15();
  }

  private native void FastModeOn_16();
  public void FastModeOn()
  {
    FastModeOn_16();
  }

  private native void FastModeOff_17();
  public void FastModeOff()
  {
    FastModeOff_17();
  }

  private native void SetOriginalCellIdsName_18(byte[] id0, int len0);
  public void SetOriginalCellIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalCellIdsName_18(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalCellIdsName_19();
  public String GetOriginalCellIdsName()
  {
    return new String(GetOriginalCellIdsName_19(), StandardCharsets.UTF_8);
  }

  private native void SetOriginalPointIdsName_20(byte[] id0, int len0);
  public void SetOriginalPointIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalPointIdsName_20(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalPointIdsName_21();
  public String GetOriginalPointIdsName()
  {
    return new String(GetOriginalPointIdsName_21(), StandardCharsets.UTF_8);
  }

  private native void SetNonlinearSubdivisionLevel_22(int id0);
  public void SetNonlinearSubdivisionLevel(int id0)
  {
    SetNonlinearSubdivisionLevel_22(id0);
  }

  private native int GetNonlinearSubdivisionLevel_23();
  public int GetNonlinearSubdivisionLevel()
  {
    return GetNonlinearSubdivisionLevel_23();
  }

  private native void SetMatchBoundariesIgnoringCellOrder_24(int id0);
  public void SetMatchBoundariesIgnoringCellOrder(int id0)
  {
    SetMatchBoundariesIgnoringCellOrder_24(id0);
  }

  private native int GetMatchBoundariesIgnoringCellOrder_25();
  public int GetMatchBoundariesIgnoringCellOrder()
  {
    return GetMatchBoundariesIgnoringCellOrder_25();
  }

  private native void SetAllowInterpolation_26(int id0);
  public void SetAllowInterpolation(int id0)
  {
    SetAllowInterpolation_26(id0);
  }

  private native int GetAllowInterpolation_27();
  public int GetAllowInterpolation()
  {
    return GetAllowInterpolation_27();
  }

  private native void AllowInterpolationOn_28();
  public void AllowInterpolationOn()
  {
    AllowInterpolationOn_28();
  }

  private native void AllowInterpolationOff_29();
  public void AllowInterpolationOff()
  {
    AllowInterpolationOff_29();
  }

  private native void SetDelegation_30(int id0);
  public void SetDelegation(int id0)
  {
    SetDelegation_30(id0);
  }

  private native int GetDelegation_31();
  public int GetDelegation()
  {
    return GetDelegation_31();
  }

  private native void DelegationOn_32();
  public void DelegationOn()
  {
    DelegationOn_32();
  }

  private native void DelegationOff_33();
  public void DelegationOff()
  {
    DelegationOff_33();
  }

  private native int UnstructuredGridExecute_34(vtkDataSet id0,vtkPolyData id1);
  public int UnstructuredGridExecute(vtkDataSet id0,vtkPolyData id1)
  {
    return UnstructuredGridExecute_34(id0,id1);
  }

  private native int DataSetExecute_35(vtkDataSet id0,vtkPolyData id1);
  public int DataSetExecute(vtkDataSet id0,vtkPolyData id1)
  {
    return DataSetExecute_35(id0,id1);
  }

  public vtkDataSetSurfaceFilter() { super(); }

  public vtkDataSetSurfaceFilter(long id) { super(id); }
  public native long   VTKInit();

}
