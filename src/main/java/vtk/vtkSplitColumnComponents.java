// java wrapper for vtkSplitColumnComponents object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSplitColumnComponents extends vtkTableAlgorithm
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

  private native void SetCalculateMagnitudes_4(boolean id0);
  public void SetCalculateMagnitudes(boolean id0)
  {
    SetCalculateMagnitudes_4(id0);
  }

  private native boolean GetCalculateMagnitudes_5();
  public boolean GetCalculateMagnitudes()
  {
    return GetCalculateMagnitudes_5();
  }

  private native void CalculateMagnitudesOn_6();
  public void CalculateMagnitudesOn()
  {
    CalculateMagnitudesOn_6();
  }

  private native void CalculateMagnitudesOff_7();
  public void CalculateMagnitudesOff()
  {
    CalculateMagnitudesOff_7();
  }

  private native void SetNamingMode_8(int id0);
  public void SetNamingMode(int id0)
  {
    SetNamingMode_8(id0);
  }

  private native int GetNamingModeMinValue_9();
  public int GetNamingModeMinValue()
  {
    return GetNamingModeMinValue_9();
  }

  private native int GetNamingModeMaxValue_10();
  public int GetNamingModeMaxValue()
  {
    return GetNamingModeMaxValue_10();
  }

  private native void SetNamingModeToNumberWithParens_11();
  public void SetNamingModeToNumberWithParens()
  {
    SetNamingModeToNumberWithParens_11();
  }

  private native void SetNamingModeToNumberWithUnderscores_12();
  public void SetNamingModeToNumberWithUnderscores()
  {
    SetNamingModeToNumberWithUnderscores_12();
  }

  private native void SetNamingModeToNamesWithParens_13();
  public void SetNamingModeToNamesWithParens()
  {
    SetNamingModeToNamesWithParens_13();
  }

  private native void SetNamingModeToNamesWithUnderscores_14();
  public void SetNamingModeToNamesWithUnderscores()
  {
    SetNamingModeToNamesWithUnderscores_14();
  }

  private native int GetNamingMode_15();
  public int GetNamingMode()
  {
    return GetNamingMode_15();
  }

  private native long ORIGINAL_ARRAY_NAME_16();
  public vtkInformationStringKey ORIGINAL_ARRAY_NAME()
  {
    long temp = ORIGINAL_ARRAY_NAME_16();

    if (temp == 0) return null;
    return (vtkInformationStringKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ORIGINAL_COMPONENT_NUMBER_17();
  public vtkInformationIntegerKey ORIGINAL_COMPONENT_NUMBER()
  {
    long temp = ORIGINAL_COMPONENT_NUMBER_17();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkSplitColumnComponents() { super(); }

  public vtkSplitColumnComponents(long id) { super(id); }
  public native long   VTKInit();

}
