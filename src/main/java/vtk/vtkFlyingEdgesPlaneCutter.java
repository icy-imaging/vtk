// java wrapper for vtkFlyingEdgesPlaneCutter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFlyingEdgesPlaneCutter extends vtkPolyDataAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetPlane_5(vtkPlane id0);
  public void SetPlane(vtkPlane id0)
  {
    SetPlane_5(id0);
  }

  private native long GetPlane_6();
  public vtkPlane GetPlane()
  {
    long temp = GetPlane_6();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComputeNormals_7(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_7(id0);
  }

  private native int GetComputeNormals_8();
  public int GetComputeNormals()
  {
    return GetComputeNormals_8();
  }

  private native void ComputeNormalsOn_9();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_9();
  }

  private native void ComputeNormalsOff_10();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_10();
  }

  private native void SetInterpolateAttributes_11(int id0);
  public void SetInterpolateAttributes(int id0)
  {
    SetInterpolateAttributes_11(id0);
  }

  private native int GetInterpolateAttributes_12();
  public int GetInterpolateAttributes()
  {
    return GetInterpolateAttributes_12();
  }

  private native void InterpolateAttributesOn_13();
  public void InterpolateAttributesOn()
  {
    InterpolateAttributesOn_13();
  }

  private native void InterpolateAttributesOff_14();
  public void InterpolateAttributesOff()
  {
    InterpolateAttributesOff_14();
  }

  private native void SetArrayComponent_15(int id0);
  public void SetArrayComponent(int id0)
  {
    SetArrayComponent_15(id0);
  }

  private native int GetArrayComponent_16();
  public int GetArrayComponent()
  {
    return GetArrayComponent_16();
  }

  public vtkFlyingEdgesPlaneCutter() { super(); }

  public vtkFlyingEdgesPlaneCutter(long id) { super(id); }
  public native long   VTKInit();

}
