// java wrapper for vtkLassoStencilSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLassoStencilSource extends vtkImageStencilSource
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

  private native int GetShape_4();
  public int GetShape()
  {
    return GetShape_4();
  }

  private native void SetShape_5(int id0);
  public void SetShape(int id0)
  {
    SetShape_5(id0);
  }

  private native int GetShapeMinValue_6();
  public int GetShapeMinValue()
  {
    return GetShapeMinValue_6();
  }

  private native int GetShapeMaxValue_7();
  public int GetShapeMaxValue()
  {
    return GetShapeMaxValue_7();
  }

  private native void SetShapeToPolygon_8();
  public void SetShapeToPolygon()
  {
    SetShapeToPolygon_8();
  }

  private native void SetShapeToSpline_9();
  public void SetShapeToSpline()
  {
    SetShapeToSpline_9();
  }

  private native byte[] GetShapeAsString_10();
  public String GetShapeAsString()
  {
    return new String(GetShapeAsString_10(), StandardCharsets.UTF_8);
  }

  private native void SetPoints_11(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_11(id0);
  }

  private native long GetPoints_12();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_12();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetSliceOrientation_13();
  public int GetSliceOrientation()
  {
    return GetSliceOrientation_13();
  }

  private native void SetSliceOrientation_14(int id0);
  public void SetSliceOrientation(int id0)
  {
    SetSliceOrientation_14(id0);
  }

  private native int GetSliceOrientationMinValue_15();
  public int GetSliceOrientationMinValue()
  {
    return GetSliceOrientationMinValue_15();
  }

  private native int GetSliceOrientationMaxValue_16();
  public int GetSliceOrientationMaxValue()
  {
    return GetSliceOrientationMaxValue_16();
  }

  private native void SetSlicePoints_17(int id0,vtkPoints id1);
  public void SetSlicePoints(int id0,vtkPoints id1)
  {
    SetSlicePoints_17(id0,id1);
  }

  private native long GetSlicePoints_18(int id0);
  public vtkPoints GetSlicePoints(int id0)
  {
    long temp = GetSlicePoints_18(id0);

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveAllSlicePoints_19();
  public void RemoveAllSlicePoints()
  {
    RemoveAllSlicePoints_19();
  }

  private native long GetMTime_20();
  public long GetMTime()
  {
    return GetMTime_20();
  }

  public vtkLassoStencilSource() { super(); }

  public vtkLassoStencilSource(long id) { super(id); }
  public native long   VTKInit();

}
