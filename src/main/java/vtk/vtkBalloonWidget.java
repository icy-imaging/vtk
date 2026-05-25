// java wrapper for vtkBalloonWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBalloonWidget extends vtkHoverWidget
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void SetRepresentation_5(vtkBalloonRepresentation id0);
  public void SetRepresentation(vtkBalloonRepresentation id0)
  {
    SetRepresentation_5(id0);
  }

  private native long GetBalloonRepresentation_6();
  public vtkBalloonRepresentation GetBalloonRepresentation()
  {
    long temp = GetBalloonRepresentation_6();

    if (temp == 0) return null;
    return (vtkBalloonRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_7();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_7();
  }

  private native void AddBalloon_8(vtkProp id0,byte[] id1, int len1,vtkImageData id2);
  public void AddBalloon(vtkProp id0,String id1,vtkImageData id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddBalloon_8(id0,bytes1, bytes1.length,id2);
  }

  private native void AddBalloon_9(vtkProp id0,byte[] id1, int len1);
  public void AddBalloon(vtkProp id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddBalloon_9(id0,bytes1, bytes1.length);
  }

  private native void RemoveBalloon_10(vtkProp id0);
  public void RemoveBalloon(vtkProp id0)
  {
    RemoveBalloon_10(id0);
  }

  private native byte[] GetBalloonString_11(vtkProp id0);
  public String GetBalloonString(vtkProp id0)
  {
    return new String(GetBalloonString_11(id0), StandardCharsets.UTF_8);
  }

  private native long GetBalloonImage_12(vtkProp id0);
  public vtkImageData GetBalloonImage(vtkProp id0)
  {
    long temp = GetBalloonImage_12(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdateBalloonString_13(vtkProp id0,byte[] id1, int len1);
  public void UpdateBalloonString(vtkProp id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    UpdateBalloonString_13(id0,bytes1, bytes1.length);
  }

  private native void UpdateBalloonImage_14(vtkProp id0,vtkImageData id1);
  public void UpdateBalloonImage(vtkProp id0,vtkImageData id1)
  {
    UpdateBalloonImage_14(id0,id1);
  }

  private native long GetCurrentProp_15();
  public vtkProp GetCurrentProp()
  {
    long temp = GetCurrentProp_15();

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPicker_16(vtkAbstractPropPicker id0);
  public void SetPicker(vtkAbstractPropPicker id0)
  {
    SetPicker_16(id0);
  }

  private native long GetPicker_17();
  public vtkAbstractPropPicker GetPicker()
  {
    long temp = GetPicker_17();

    if (temp == 0) return null;
    return (vtkAbstractPropPicker)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RegisterPickers_18();
  public void RegisterPickers()
  {
    RegisterPickers_18();
  }

  public vtkBalloonWidget() { super(); }

  public vtkBalloonWidget(long id) { super(id); }
  public native long   VTKInit();

}
