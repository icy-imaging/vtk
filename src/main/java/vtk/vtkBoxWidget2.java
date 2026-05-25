// java wrapper for vtkBoxWidget2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBoxWidget2 extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkBoxRepresentation id0);
  public void SetRepresentation(vtkBoxRepresentation id0)
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

  private native void SetRotationEnabled_13(int id0);
  public void SetRotationEnabled(int id0)
  {
    SetRotationEnabled_13(id0);
  }

  private native int GetRotationEnabled_14();
  public int GetRotationEnabled()
  {
    return GetRotationEnabled_14();
  }

  private native void RotationEnabledOn_15();
  public void RotationEnabledOn()
  {
    RotationEnabledOn_15();
  }

  private native void RotationEnabledOff_16();
  public void RotationEnabledOff()
  {
    RotationEnabledOff_16();
  }

  private native void SetMoveFacesEnabled_17(int id0);
  public void SetMoveFacesEnabled(int id0)
  {
    SetMoveFacesEnabled_17(id0);
  }

  private native int GetMoveFacesEnabled_18();
  public int GetMoveFacesEnabled()
  {
    return GetMoveFacesEnabled_18();
  }

  private native void MoveFacesEnabledOn_19();
  public void MoveFacesEnabledOn()
  {
    MoveFacesEnabledOn_19();
  }

  private native void MoveFacesEnabledOff_20();
  public void MoveFacesEnabledOff()
  {
    MoveFacesEnabledOff_20();
  }

  private native void CreateDefaultRepresentation_21();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_21();
  }

  private native void SetEnabled_22(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_22(id0);
  }

  public vtkBoxWidget2() { super(); }

  public vtkBoxWidget2(long id) { super(id); }
  public native long   VTKInit();

}
