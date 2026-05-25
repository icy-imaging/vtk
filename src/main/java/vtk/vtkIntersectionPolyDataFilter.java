// java wrapper for vtkIntersectionPolyDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIntersectionPolyDataFilter extends vtkPolyDataAlgorithm
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

  private native int GetNumberOfIntersectionPoints_4();
  public int GetNumberOfIntersectionPoints()
  {
    return GetNumberOfIntersectionPoints_4();
  }

  private native int GetNumberOfIntersectionLines_5();
  public int GetNumberOfIntersectionLines()
  {
    return GetNumberOfIntersectionLines_5();
  }

  private native int GetSplitFirstOutput_6();
  public int GetSplitFirstOutput()
  {
    return GetSplitFirstOutput_6();
  }

  private native void SetSplitFirstOutput_7(int id0);
  public void SetSplitFirstOutput(int id0)
  {
    SetSplitFirstOutput_7(id0);
  }

  private native void SplitFirstOutputOn_8();
  public void SplitFirstOutputOn()
  {
    SplitFirstOutputOn_8();
  }

  private native void SplitFirstOutputOff_9();
  public void SplitFirstOutputOff()
  {
    SplitFirstOutputOff_9();
  }

  private native int GetSplitSecondOutput_10();
  public int GetSplitSecondOutput()
  {
    return GetSplitSecondOutput_10();
  }

  private native void SetSplitSecondOutput_11(int id0);
  public void SetSplitSecondOutput(int id0)
  {
    SetSplitSecondOutput_11(id0);
  }

  private native void SplitSecondOutputOn_12();
  public void SplitSecondOutputOn()
  {
    SplitSecondOutputOn_12();
  }

  private native void SplitSecondOutputOff_13();
  public void SplitSecondOutputOff()
  {
    SplitSecondOutputOff_13();
  }

  private native int GetComputeIntersectionPointArray_14();
  public int GetComputeIntersectionPointArray()
  {
    return GetComputeIntersectionPointArray_14();
  }

  private native void SetComputeIntersectionPointArray_15(int id0);
  public void SetComputeIntersectionPointArray(int id0)
  {
    SetComputeIntersectionPointArray_15(id0);
  }

  private native void ComputeIntersectionPointArrayOn_16();
  public void ComputeIntersectionPointArrayOn()
  {
    ComputeIntersectionPointArrayOn_16();
  }

  private native void ComputeIntersectionPointArrayOff_17();
  public void ComputeIntersectionPointArrayOff()
  {
    ComputeIntersectionPointArrayOff_17();
  }

  private native int GetCheckInput_18();
  public int GetCheckInput()
  {
    return GetCheckInput_18();
  }

  private native void SetCheckInput_19(int id0);
  public void SetCheckInput(int id0)
  {
    SetCheckInput_19(id0);
  }

  private native void CheckInputOn_20();
  public void CheckInputOn()
  {
    CheckInputOn_20();
  }

  private native void CheckInputOff_21();
  public void CheckInputOff()
  {
    CheckInputOff_21();
  }

  private native int GetCheckMesh_22();
  public int GetCheckMesh()
  {
    return GetCheckMesh_22();
  }

  private native void SetCheckMesh_23(int id0);
  public void SetCheckMesh(int id0)
  {
    SetCheckMesh_23(id0);
  }

  private native void CheckMeshOn_24();
  public void CheckMeshOn()
  {
    CheckMeshOn_24();
  }

  private native void CheckMeshOff_25();
  public void CheckMeshOff()
  {
    CheckMeshOff_25();
  }

  private native int GetStatus_26();
  public int GetStatus()
  {
    return GetStatus_26();
  }

  private native double GetTolerance_27();
  public double GetTolerance()
  {
    return GetTolerance_27();
  }

  private native void SetTolerance_28(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_28(id0);
  }

  private native double GetRelativeSubtriangleArea_29();
  public double GetRelativeSubtriangleArea()
  {
    return GetRelativeSubtriangleArea_29();
  }

  private native void SetRelativeSubtriangleArea_30(double id0);
  public void SetRelativeSubtriangleArea(double id0)
  {
    SetRelativeSubtriangleArea_30(id0);
  }

  private native void CleanAndCheckSurface_31(vtkPolyData id0,double id1[],double id2);
  public void CleanAndCheckSurface(vtkPolyData id0,double id1[],double id2)
  {
    CleanAndCheckSurface_31(id0,id1,id2);
  }

  private native void CleanAndCheckInput_32(vtkPolyData id0,double id1);
  public void CleanAndCheckInput(vtkPolyData id0,double id1)
  {
    CleanAndCheckInput_32(id0,id1);
  }

  public vtkIntersectionPolyDataFilter() { super(); }

  public vtkIntersectionPolyDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
