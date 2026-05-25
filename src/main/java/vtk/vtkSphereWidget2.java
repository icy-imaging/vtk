// java wrapper for vtkSphereWidget2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSphereWidget2 extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkSphereRepresentation id0);
  public void SetRepresentation(vtkSphereRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native void SetTranslationEnabled_5(int id0);
  public void SetTranslationEnabled(int id0)
  {
    SetTranslationEnabled_5(id0);
  }

  private native int GetTranslationEnabled_6();
  public int GetTranslationEnabled()
  {
    return GetTranslationEnabled_6();
  }

  private native void TranslationEnabledOn_7();
  public void TranslationEnabledOn()
  {
    TranslationEnabledOn_7();
  }

  private native void TranslationEnabledOff_8();
  public void TranslationEnabledOff()
  {
    TranslationEnabledOff_8();
  }

  private native void SetScalingEnabled_9(int id0);
  public void SetScalingEnabled(int id0)
  {
    SetScalingEnabled_9(id0);
  }

  private native int GetScalingEnabled_10();
  public int GetScalingEnabled()
  {
    return GetScalingEnabled_10();
  }

  private native void ScalingEnabledOn_11();
  public void ScalingEnabledOn()
  {
    ScalingEnabledOn_11();
  }

  private native void ScalingEnabledOff_12();
  public void ScalingEnabledOff()
  {
    ScalingEnabledOff_12();
  }

  private native void CreateDefaultRepresentation_13();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_13();
  }

  private native void SetEnabled_14(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_14(id0);
  }

  public vtkSphereWidget2() { super(); }

  public vtkSphereWidget2(long id) { super(id); }
  public native long   VTKInit();

}
