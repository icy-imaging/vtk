// java wrapper for vtkTanglegramItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTanglegramItem extends vtkContextItem
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

  private native void SetTree1_4(vtkTree id0);
  public void SetTree1(vtkTree id0)
  {
    SetTree1_4(id0);
  }

  private native void SetTree2_5(vtkTree id0);
  public void SetTree2(vtkTree id0)
  {
    SetTree2_5(id0);
  }

  private native long GetTable_6();
  public vtkTable GetTable()
  {
    long temp = GetTable_6();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTable_7(vtkTable id0);
  public void SetTable(vtkTable id0)
  {
    SetTable_7(id0);
  }

  private native byte[] GetTree1Label_8();
  public String GetTree1Label()
  {
    return new String(GetTree1Label_8(), StandardCharsets.UTF_8);
  }

  private native void SetTree1Label_9(byte[] id0, int len0);
  public void SetTree1Label(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTree1Label_9(bytes0, bytes0.length);
  }

  private native byte[] GetTree2Label_10();
  public String GetTree2Label()
  {
    return new String(GetTree2Label_10(), StandardCharsets.UTF_8);
  }

  private native void SetTree2Label_11(byte[] id0, int len0);
  public void SetTree2Label(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTree2Label_11(bytes0, bytes0.length);
  }

  private native void SetOrientation_12(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_12(id0);
  }

  private native int GetOrientation_13();
  public int GetOrientation()
  {
    return GetOrientation_13();
  }

  private native int GetMinimumVisibleFontSize_14();
  public int GetMinimumVisibleFontSize()
  {
    return GetMinimumVisibleFontSize_14();
  }

  private native void SetMinimumVisibleFontSize_15(int id0);
  public void SetMinimumVisibleFontSize(int id0)
  {
    SetMinimumVisibleFontSize_15(id0);
  }

  private native int GetLabelSizeDifference_16();
  public int GetLabelSizeDifference()
  {
    return GetLabelSizeDifference_16();
  }

  private native void SetLabelSizeDifference_17(int id0);
  public void SetLabelSizeDifference(int id0)
  {
    SetLabelSizeDifference_17(id0);
  }

  private native float GetCorrespondenceLineWidth_18();
  public float GetCorrespondenceLineWidth()
  {
    return GetCorrespondenceLineWidth_18();
  }

  private native void SetCorrespondenceLineWidth_19(float id0);
  public void SetCorrespondenceLineWidth(float id0)
  {
    SetCorrespondenceLineWidth_19(id0);
  }

  private native float GetTreeLineWidth_20();
  public float GetTreeLineWidth()
  {
    return GetTreeLineWidth_20();
  }

  private native void SetTreeLineWidth_21(float id0);
  public void SetTreeLineWidth(float id0)
  {
    SetTreeLineWidth_21(id0);
  }

  public vtkTanglegramItem() { super(); }

  public vtkTanglegramItem(long id) { super(id); }
  public native long   VTKInit();

}
