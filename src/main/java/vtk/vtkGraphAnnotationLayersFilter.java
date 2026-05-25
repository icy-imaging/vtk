// java wrapper for vtkGraphAnnotationLayersFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphAnnotationLayersFilter extends vtkPolyDataAlgorithm
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

  private native void OutlineOn_4();
  public void OutlineOn()
  {
    OutlineOn_4();
  }

  private native void OutlineOff_5();
  public void OutlineOff()
  {
    OutlineOff_5();
  }

  private native void SetOutline_6(boolean id0);
  public void SetOutline(boolean id0)
  {
    SetOutline_6(id0);
  }

  private native void SetScaleFactor_7(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_7(id0);
  }

  private native void SetHullShapeToBoundingRectangle_8();
  public void SetHullShapeToBoundingRectangle()
  {
    SetHullShapeToBoundingRectangle_8();
  }

  private native void SetHullShapeToConvexHull_9();
  public void SetHullShapeToConvexHull()
  {
    SetHullShapeToConvexHull_9();
  }

  private native void SetMinHullSizeInWorld_10(double id0);
  public void SetMinHullSizeInWorld(double id0)
  {
    SetMinHullSizeInWorld_10(id0);
  }

  private native void SetMinHullSizeInDisplay_11(int id0);
  public void SetMinHullSizeInDisplay(int id0)
  {
    SetMinHullSizeInDisplay_11(id0);
  }

  private native void SetRenderer_12(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_12(id0);
  }

  private native long GetMTime_13();
  public long GetMTime()
  {
    return GetMTime_13();
  }

  public vtkGraphAnnotationLayersFilter() { super(); }

  public vtkGraphAnnotationLayersFilter(long id) { super(id); }
  public native long   VTKInit();

}
