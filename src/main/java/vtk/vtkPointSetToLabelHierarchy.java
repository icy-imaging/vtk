// java wrapper for vtkPointSetToLabelHierarchy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointSetToLabelHierarchy extends vtkLabelHierarchyAlgorithm
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

  private native void SetTargetLabelCount_4(int id0);
  public void SetTargetLabelCount(int id0)
  {
    SetTargetLabelCount_4(id0);
  }

  private native int GetTargetLabelCount_5();
  public int GetTargetLabelCount()
  {
    return GetTargetLabelCount_5();
  }

  private native void SetMaximumDepth_6(int id0);
  public void SetMaximumDepth(int id0)
  {
    SetMaximumDepth_6(id0);
  }

  private native int GetMaximumDepth_7();
  public int GetMaximumDepth()
  {
    return GetMaximumDepth_7();
  }

  private native void SetLabelArrayName_8(byte[] id0, int len0);
  public void SetLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetLabelArrayName_9();
  public String GetLabelArrayName()
  {
    return new String(GetLabelArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetSizeArrayName_10(byte[] id0, int len0);
  public void SetSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSizeArrayName_10(bytes0, bytes0.length);
  }

  private native byte[] GetSizeArrayName_11();
  public String GetSizeArrayName()
  {
    return new String(GetSizeArrayName_11(), StandardCharsets.UTF_8);
  }

  private native void SetPriorityArrayName_12(byte[] id0, int len0);
  public void SetPriorityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPriorityArrayName_12(bytes0, bytes0.length);
  }

  private native byte[] GetPriorityArrayName_13();
  public String GetPriorityArrayName()
  {
    return new String(GetPriorityArrayName_13(), StandardCharsets.UTF_8);
  }

  private native void SetIconIndexArrayName_14(byte[] id0, int len0);
  public void SetIconIndexArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIconIndexArrayName_14(bytes0, bytes0.length);
  }

  private native byte[] GetIconIndexArrayName_15();
  public String GetIconIndexArrayName()
  {
    return new String(GetIconIndexArrayName_15(), StandardCharsets.UTF_8);
  }

  private native void SetOrientationArrayName_16(byte[] id0, int len0);
  public void SetOrientationArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOrientationArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetOrientationArrayName_17();
  public String GetOrientationArrayName()
  {
    return new String(GetOrientationArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetBoundedSizeArrayName_18(byte[] id0, int len0);
  public void SetBoundedSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBoundedSizeArrayName_18(bytes0, bytes0.length);
  }

  private native byte[] GetBoundedSizeArrayName_19();
  public String GetBoundedSizeArrayName()
  {
    return new String(GetBoundedSizeArrayName_19(), StandardCharsets.UTF_8);
  }

  private native void SetTextProperty_20(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_20(id0);
  }

  private native long GetTextProperty_21();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_21();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPointSetToLabelHierarchy() { super(); }

  public vtkPointSetToLabelHierarchy(long id) { super(id); }
  public native long   VTKInit();

}
