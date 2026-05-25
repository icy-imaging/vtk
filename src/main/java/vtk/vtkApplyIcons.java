// java wrapper for vtkApplyIcons object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkApplyIcons extends vtkPassInputTypeAlgorithm
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

  private native void SetIconType_4(double id0,int id1);
  public void SetIconType(double id0,int id1)
  {
    SetIconType_4(id0,id1);
  }

  private native void SetIconType_5(byte[] id0, int len0,int id1);
  public void SetIconType(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIconType_5(bytes0, bytes0.length,id1);
  }

  private native void ClearAllIconTypes_6();
  public void ClearAllIconTypes()
  {
    ClearAllIconTypes_6();
  }

  private native void SetUseLookupTable_7(boolean id0);
  public void SetUseLookupTable(boolean id0)
  {
    SetUseLookupTable_7(id0);
  }

  private native boolean GetUseLookupTable_8();
  public boolean GetUseLookupTable()
  {
    return GetUseLookupTable_8();
  }

  private native void UseLookupTableOn_9();
  public void UseLookupTableOn()
  {
    UseLookupTableOn_9();
  }

  private native void UseLookupTableOff_10();
  public void UseLookupTableOff()
  {
    UseLookupTableOff_10();
  }

  private native void SetDefaultIcon_11(int id0);
  public void SetDefaultIcon(int id0)
  {
    SetDefaultIcon_11(id0);
  }

  private native int GetDefaultIcon_12();
  public int GetDefaultIcon()
  {
    return GetDefaultIcon_12();
  }

  private native void SetSelectedIcon_13(int id0);
  public void SetSelectedIcon(int id0)
  {
    SetSelectedIcon_13(id0);
  }

  private native int GetSelectedIcon_14();
  public int GetSelectedIcon()
  {
    return GetSelectedIcon_14();
  }

  private native void SetIconOutputArrayName_15(byte[] id0, int len0);
  public void SetIconOutputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIconOutputArrayName_15(bytes0, bytes0.length);
  }

  private native byte[] GetIconOutputArrayName_16();
  public String GetIconOutputArrayName()
  {
    return new String(GetIconOutputArrayName_16(), StandardCharsets.UTF_8);
  }

  private native void SetSelectionMode_17(int id0);
  public void SetSelectionMode(int id0)
  {
    SetSelectionMode_17(id0);
  }

  private native int GetSelectionMode_18();
  public int GetSelectionMode()
  {
    return GetSelectionMode_18();
  }

  private native void SetSelectionModeToSelectedIcon_19();
  public void SetSelectionModeToSelectedIcon()
  {
    SetSelectionModeToSelectedIcon_19();
  }

  private native void SetSelectionModeToSelectedOffset_20();
  public void SetSelectionModeToSelectedOffset()
  {
    SetSelectionModeToSelectedOffset_20();
  }

  private native void SetSelectionModeToAnnotationIcon_21();
  public void SetSelectionModeToAnnotationIcon()
  {
    SetSelectionModeToAnnotationIcon_21();
  }

  private native void SetSelectionModeToIgnoreSelection_22();
  public void SetSelectionModeToIgnoreSelection()
  {
    SetSelectionModeToIgnoreSelection_22();
  }

  private native void SetAttributeType_23(int id0);
  public void SetAttributeType(int id0)
  {
    SetAttributeType_23(id0);
  }

  private native int GetAttributeType_24();
  public int GetAttributeType()
  {
    return GetAttributeType_24();
  }

  public vtkApplyIcons() { super(); }

  public vtkApplyIcons(long id) { super(id); }
  public native long   VTKInit();

}
