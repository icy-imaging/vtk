// java wrapper for vtkBoundaryMeshQuality object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBoundaryMeshQuality extends vtkPolyDataAlgorithm
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

  private native void SetDistanceFromCellCenterToFaceCenter_4(boolean id0);
  public void SetDistanceFromCellCenterToFaceCenter(boolean id0)
  {
    SetDistanceFromCellCenterToFaceCenter_4(id0);
  }

  private native boolean GetDistanceFromCellCenterToFaceCenter_5();
  public boolean GetDistanceFromCellCenterToFaceCenter()
  {
    return GetDistanceFromCellCenterToFaceCenter_5();
  }

  private native void DistanceFromCellCenterToFaceCenterOn_6();
  public void DistanceFromCellCenterToFaceCenterOn()
  {
    DistanceFromCellCenterToFaceCenterOn_6();
  }

  private native void DistanceFromCellCenterToFaceCenterOff_7();
  public void DistanceFromCellCenterToFaceCenterOff()
  {
    DistanceFromCellCenterToFaceCenterOff_7();
  }

  private native void SetDistanceFromCellCenterToFacePlane_8(boolean id0);
  public void SetDistanceFromCellCenterToFacePlane(boolean id0)
  {
    SetDistanceFromCellCenterToFacePlane_8(id0);
  }

  private native boolean GetDistanceFromCellCenterToFacePlane_9();
  public boolean GetDistanceFromCellCenterToFacePlane()
  {
    return GetDistanceFromCellCenterToFacePlane_9();
  }

  private native void DistanceFromCellCenterToFacePlaneOn_10();
  public void DistanceFromCellCenterToFacePlaneOn()
  {
    DistanceFromCellCenterToFacePlaneOn_10();
  }

  private native void DistanceFromCellCenterToFacePlaneOff_11();
  public void DistanceFromCellCenterToFacePlaneOff()
  {
    DistanceFromCellCenterToFacePlaneOff_11();
  }

  private native void SetAngleFaceNormalAndCellCenterToFaceCenterVector_12(boolean id0);
  public void SetAngleFaceNormalAndCellCenterToFaceCenterVector(boolean id0)
  {
    SetAngleFaceNormalAndCellCenterToFaceCenterVector_12(id0);
  }

  private native boolean GetAngleFaceNormalAndCellCenterToFaceCenterVector_13();
  public boolean GetAngleFaceNormalAndCellCenterToFaceCenterVector()
  {
    return GetAngleFaceNormalAndCellCenterToFaceCenterVector_13();
  }

  private native void AngleFaceNormalAndCellCenterToFaceCenterVectorOn_14();
  public void AngleFaceNormalAndCellCenterToFaceCenterVectorOn()
  {
    AngleFaceNormalAndCellCenterToFaceCenterVectorOn_14();
  }

  private native void AngleFaceNormalAndCellCenterToFaceCenterVectorOff_15();
  public void AngleFaceNormalAndCellCenterToFaceCenterVectorOff()
  {
    AngleFaceNormalAndCellCenterToFaceCenterVectorOff_15();
  }

  public vtkBoundaryMeshQuality() { super(); }

  public vtkBoundaryMeshQuality(long id) { super(id); }
  public native long   VTKInit();

}
