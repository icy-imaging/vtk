// java wrapper for vtkConvexHull2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConvexHull2D extends vtkPolyDataAlgorithm
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

  private native double GetScaleFactor_4();
  public double GetScaleFactor()
  {
    return GetScaleFactor_4();
  }

  private native void SetScaleFactor_5(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_5(id0);
  }

  private native boolean GetOutline_6();
  public boolean GetOutline()
  {
    return GetOutline_6();
  }

  private native void SetOutline_7(boolean id0);
  public void SetOutline(boolean id0)
  {
    SetOutline_7(id0);
  }

  private native void OutlineOn_8();
  public void OutlineOn()
  {
    OutlineOn_8();
  }

  private native void OutlineOff_9();
  public void OutlineOff()
  {
    OutlineOff_9();
  }

  private native int GetHullShape_10();
  public int GetHullShape()
  {
    return GetHullShape_10();
  }

  private native void SetHullShape_11(int id0);
  public void SetHullShape(int id0)
  {
    SetHullShape_11(id0);
  }

  private native int GetHullShapeMinValue_12();
  public int GetHullShapeMinValue()
  {
    return GetHullShapeMinValue_12();
  }

  private native int GetHullShapeMaxValue_13();
  public int GetHullShapeMaxValue()
  {
    return GetHullShapeMaxValue_13();
  }

  private native void SetMinHullSizeInWorld_14(double id0);
  public void SetMinHullSizeInWorld(double id0)
  {
    SetMinHullSizeInWorld_14(id0);
  }

  private native double GetMinHullSizeInWorldMinValue_15();
  public double GetMinHullSizeInWorldMinValue()
  {
    return GetMinHullSizeInWorldMinValue_15();
  }

  private native double GetMinHullSizeInWorldMaxValue_16();
  public double GetMinHullSizeInWorldMaxValue()
  {
    return GetMinHullSizeInWorldMaxValue_16();
  }

  private native double GetMinHullSizeInWorld_17();
  public double GetMinHullSizeInWorld()
  {
    return GetMinHullSizeInWorld_17();
  }

  private native void SetMinHullSizeInDisplay_18(int id0);
  public void SetMinHullSizeInDisplay(int id0)
  {
    SetMinHullSizeInDisplay_18(id0);
  }

  private native int GetMinHullSizeInDisplayMinValue_19();
  public int GetMinHullSizeInDisplayMinValue()
  {
    return GetMinHullSizeInDisplayMinValue_19();
  }

  private native int GetMinHullSizeInDisplayMaxValue_20();
  public int GetMinHullSizeInDisplayMaxValue()
  {
    return GetMinHullSizeInDisplayMaxValue_20();
  }

  private native int GetMinHullSizeInDisplay_21();
  public int GetMinHullSizeInDisplay()
  {
    return GetMinHullSizeInDisplay_21();
  }

  private native void SetRenderer_22(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_22(id0);
  }

  private native long GetRenderer_23();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_23();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_24();
  public long GetMTime()
  {
    return GetMTime_24();
  }

  private native void CalculateBoundingRectangle_25(vtkPoints id0,vtkPoints id1,double id2);
  public void CalculateBoundingRectangle(vtkPoints id0,vtkPoints id1,double id2)
  {
    CalculateBoundingRectangle_25(id0,id1,id2);
  }

  private native void CalculateConvexHull_26(vtkPoints id0,vtkPoints id1,double id2);
  public void CalculateConvexHull(vtkPoints id0,vtkPoints id1,double id2)
  {
    CalculateConvexHull_26(id0,id1,id2);
  }

  public vtkConvexHull2D() { super(); }

  public vtkConvexHull2D(long id) { super(id); }
  public native long   VTKInit();

}
