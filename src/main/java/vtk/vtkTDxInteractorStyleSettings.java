// java wrapper for vtkTDxInteractorStyleSettings object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTDxInteractorStyleSettings extends vtkObject
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

  private native void SetAngleSensitivity_4(double id0);
  public void SetAngleSensitivity(double id0)
  {
    SetAngleSensitivity_4(id0);
  }

  private native double GetAngleSensitivity_5();
  public double GetAngleSensitivity()
  {
    return GetAngleSensitivity_5();
  }

  private native void SetUseRotationX_6(boolean id0);
  public void SetUseRotationX(boolean id0)
  {
    SetUseRotationX_6(id0);
  }

  private native boolean GetUseRotationX_7();
  public boolean GetUseRotationX()
  {
    return GetUseRotationX_7();
  }

  private native void SetUseRotationY_8(boolean id0);
  public void SetUseRotationY(boolean id0)
  {
    SetUseRotationY_8(id0);
  }

  private native boolean GetUseRotationY_9();
  public boolean GetUseRotationY()
  {
    return GetUseRotationY_9();
  }

  private native void SetUseRotationZ_10(boolean id0);
  public void SetUseRotationZ(boolean id0)
  {
    SetUseRotationZ_10(id0);
  }

  private native boolean GetUseRotationZ_11();
  public boolean GetUseRotationZ()
  {
    return GetUseRotationZ_11();
  }

  private native void SetTranslationXSensitivity_12(double id0);
  public void SetTranslationXSensitivity(double id0)
  {
    SetTranslationXSensitivity_12(id0);
  }

  private native double GetTranslationXSensitivity_13();
  public double GetTranslationXSensitivity()
  {
    return GetTranslationXSensitivity_13();
  }

  private native void SetTranslationYSensitivity_14(double id0);
  public void SetTranslationYSensitivity(double id0)
  {
    SetTranslationYSensitivity_14(id0);
  }

  private native double GetTranslationYSensitivity_15();
  public double GetTranslationYSensitivity()
  {
    return GetTranslationYSensitivity_15();
  }

  private native void SetTranslationZSensitivity_16(double id0);
  public void SetTranslationZSensitivity(double id0)
  {
    SetTranslationZSensitivity_16(id0);
  }

  private native double GetTranslationZSensitivity_17();
  public double GetTranslationZSensitivity()
  {
    return GetTranslationZSensitivity_17();
  }

  public vtkTDxInteractorStyleSettings() { super(); }

  public vtkTDxInteractorStyleSettings(long id) { super(id); }
  public native long   VTKInit();

}
