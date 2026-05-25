// java wrapper for vtkAdaptiveDataSetSurfaceFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAdaptiveDataSetSurfaceFilter extends vtkGeometryFilter
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

  private native void SetRenderer_4(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_4(id0);
  }

  private native long GetRenderer_5();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_5();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_6();
  public long GetMTime()
  {
    return GetMTime_6();
  }

  private native void SetCircleSelection_7(boolean id0);
  public void SetCircleSelection(boolean id0)
  {
    SetCircleSelection_7(id0);
  }

  private native boolean GetCircleSelection_8();
  public boolean GetCircleSelection()
  {
    return GetCircleSelection_8();
  }

  private native void SetBBSelection_9(boolean id0);
  public void SetBBSelection(boolean id0)
  {
    SetBBSelection_9(id0);
  }

  private native boolean GetBBSelection_10();
  public boolean GetBBSelection()
  {
    return GetBBSelection_10();
  }

  private native void SetViewPointDepend_11(boolean id0);
  public void SetViewPointDepend(boolean id0)
  {
    SetViewPointDepend_11(id0);
  }

  private native boolean GetViewPointDepend_12();
  public boolean GetViewPointDepend()
  {
    return GetViewPointDepend_12();
  }

  private native void SetFixedLevelMax_13(int id0);
  public void SetFixedLevelMax(int id0)
  {
    SetFixedLevelMax_13(id0);
  }

  private native int GetFixedLevelMax_14();
  public int GetFixedLevelMax()
  {
    return GetFixedLevelMax_14();
  }

  private native void SetScale_15(double id0);
  public void SetScale(double id0)
  {
    SetScale_15(id0);
  }

  private native double GetScale_16();
  public double GetScale()
  {
    return GetScale_16();
  }

  private native void SetDynamicDecimateLevelMax_17(int id0);
  public void SetDynamicDecimateLevelMax(int id0)
  {
    SetDynamicDecimateLevelMax_17(id0);
  }

  private native int GetDynamicDecimateLevelMax_18();
  public int GetDynamicDecimateLevelMax()
  {
    return GetDynamicDecimateLevelMax_18();
  }

  public vtkAdaptiveDataSetSurfaceFilter() { super(); }

  public vtkAdaptiveDataSetSurfaceFilter(long id) { super(id); }
  public native long   VTKInit();

}
