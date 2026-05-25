// java wrapper for vtkDelaunay2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDelaunay2D extends vtkPolyDataAlgorithm
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

  private native void SetSourceData_4(vtkPolyData id0);
  public void SetSourceData(vtkPolyData id0)
  {
    SetSourceData_4(id0);
  }

  private native void SetSourceConnection_5(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_5(id0);
  }

  private native long GetSource_6();
  public vtkPolyData GetSource()
  {
    long temp = GetSource_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAlpha_7(double id0);
  public void SetAlpha(double id0)
  {
    SetAlpha_7(id0);
  }

  private native double GetAlphaMinValue_8();
  public double GetAlphaMinValue()
  {
    return GetAlphaMinValue_8();
  }

  private native double GetAlphaMaxValue_9();
  public double GetAlphaMaxValue()
  {
    return GetAlphaMaxValue_9();
  }

  private native double GetAlpha_10();
  public double GetAlpha()
  {
    return GetAlpha_10();
  }

  private native void SetTolerance_11(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_11(id0);
  }

  private native double GetToleranceMinValue_12();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_12();
  }

  private native double GetToleranceMaxValue_13();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_13();
  }

  private native double GetTolerance_14();
  public double GetTolerance()
  {
    return GetTolerance_14();
  }

  private native void SetOffset_15(double id0);
  public void SetOffset(double id0)
  {
    SetOffset_15(id0);
  }

  private native double GetOffsetMinValue_16();
  public double GetOffsetMinValue()
  {
    return GetOffsetMinValue_16();
  }

  private native double GetOffsetMaxValue_17();
  public double GetOffsetMaxValue()
  {
    return GetOffsetMaxValue_17();
  }

  private native double GetOffset_18();
  public double GetOffset()
  {
    return GetOffset_18();
  }

  private native void SetBoundingTriangulation_19(int id0);
  public void SetBoundingTriangulation(int id0)
  {
    SetBoundingTriangulation_19(id0);
  }

  private native int GetBoundingTriangulation_20();
  public int GetBoundingTriangulation()
  {
    return GetBoundingTriangulation_20();
  }

  private native void BoundingTriangulationOn_21();
  public void BoundingTriangulationOn()
  {
    BoundingTriangulationOn_21();
  }

  private native void BoundingTriangulationOff_22();
  public void BoundingTriangulationOff()
  {
    BoundingTriangulationOff_22();
  }

  private native void SetTransform_23(vtkAbstractTransform id0);
  public void SetTransform(vtkAbstractTransform id0)
  {
    SetTransform_23(id0);
  }

  private native long GetTransform_24();
  public vtkAbstractTransform GetTransform()
  {
    long temp = GetTransform_24();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProjectionPlaneMode_25(int id0);
  public void SetProjectionPlaneMode(int id0)
  {
    SetProjectionPlaneMode_25(id0);
  }

  private native int GetProjectionPlaneModeMinValue_26();
  public int GetProjectionPlaneModeMinValue()
  {
    return GetProjectionPlaneModeMinValue_26();
  }

  private native int GetProjectionPlaneModeMaxValue_27();
  public int GetProjectionPlaneModeMaxValue()
  {
    return GetProjectionPlaneModeMaxValue_27();
  }

  private native int GetProjectionPlaneMode_28();
  public int GetProjectionPlaneMode()
  {
    return GetProjectionPlaneMode_28();
  }

  private native long ComputeBestFittingPlane_29(vtkPointSet id0);
  public vtkAbstractTransform ComputeBestFittingPlane(vtkPointSet id0)
  {
    long temp = ComputeBestFittingPlane_29(id0);

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRandomPointInsertion_30(int id0);
  public void SetRandomPointInsertion(int id0)
  {
    SetRandomPointInsertion_30(id0);
  }

  private native int GetRandomPointInsertion_31();
  public int GetRandomPointInsertion()
  {
    return GetRandomPointInsertion_31();
  }

  private native void RandomPointInsertionOn_32();
  public void RandomPointInsertionOn()
  {
    RandomPointInsertionOn_32();
  }

  private native void RandomPointInsertionOff_33();
  public void RandomPointInsertionOff()
  {
    RandomPointInsertionOff_33();
  }

  public vtkDelaunay2D() { super(); }

  public vtkDelaunay2D(long id) { super(id); }
  public native long   VTKInit();

}
