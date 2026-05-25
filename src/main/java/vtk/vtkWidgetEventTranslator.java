// java wrapper for vtkWidgetEventTranslator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWidgetEventTranslator extends vtkObject
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

  private native void SetTranslation_4(long id0,long id1);
  public void SetTranslation(long id0,long id1)
  {
    SetTranslation_4(id0,id1);
  }

  private native void SetTranslation_5(byte[] id0, int len0,byte[] id1, int len1);
  public void SetTranslation(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetTranslation_5(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetTranslation_6(long id0,int id1,char id2,int id3,byte[] id4, int len4,long id5);
  public void SetTranslation(long id0,int id1,char id2,int id3,String id4,long id5)
  {
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    SetTranslation_6(id0,id1,id2,id3,bytes4, bytes4.length,id5);
  }

  private native void SetTranslation_7(vtkEvent id0,long id1);
  public void SetTranslation(vtkEvent id0,long id1)
  {
    SetTranslation_7(id0,id1);
  }

  private native void SetTranslation_8(long id0,vtkEventData id1,long id2);
  public void SetTranslation(long id0,vtkEventData id1,long id2)
  {
    SetTranslation_8(id0,id1,id2);
  }

  private native long GetTranslation_9(long id0);
  public long GetTranslation(long id0)
  {
    return GetTranslation_9(id0);
  }

  private native byte[] GetTranslation_10(byte[] id0, int len0);
  public String GetTranslation(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetTranslation_10(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native long GetTranslation_11(long id0,int id1,char id2,int id3,byte[] id4, int len4);
  public long GetTranslation(long id0,int id1,char id2,int id3,String id4)
  {
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    return GetTranslation_11(id0,id1,id2,id3,bytes4, bytes4.length);
  }

  private native long GetTranslation_12(long id0,vtkEventData id1);
  public long GetTranslation(long id0,vtkEventData id1)
  {
    return GetTranslation_12(id0,id1);
  }

  private native long GetTranslation_13(vtkEvent id0);
  public long GetTranslation(vtkEvent id0)
  {
    return GetTranslation_13(id0);
  }

  private native int RemoveTranslation_14(long id0,int id1,char id2,int id3,byte[] id4, int len4);
  public int RemoveTranslation(long id0,int id1,char id2,int id3,String id4)
  {
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    return RemoveTranslation_14(id0,id1,id2,id3,bytes4, bytes4.length);
  }

  private native int RemoveTranslation_15(vtkEvent id0);
  public int RemoveTranslation(vtkEvent id0)
  {
    return RemoveTranslation_15(id0);
  }

  private native int RemoveTranslation_16(vtkEventData id0);
  public int RemoveTranslation(vtkEventData id0)
  {
    return RemoveTranslation_16(id0);
  }

  private native int RemoveTranslation_17(long id0);
  public int RemoveTranslation(long id0)
  {
    return RemoveTranslation_17(id0);
  }

  private native int RemoveTranslation_18(byte[] id0, int len0);
  public int RemoveTranslation(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return RemoveTranslation_18(bytes0, bytes0.length);
  }

  private native void ClearEvents_19();
  public void ClearEvents()
  {
    ClearEvents_19();
  }

  private native void AddEventsToParent_20(vtkAbstractWidget id0,vtkCallbackCommand id1,float id2);
  public void AddEventsToParent(vtkAbstractWidget id0,vtkCallbackCommand id1,float id2)
  {
    AddEventsToParent_20(id0,id1,id2);
  }

  private native void AddEventsToInteractor_21(vtkRenderWindowInteractor id0,vtkCallbackCommand id1,float id2);
  public void AddEventsToInteractor(vtkRenderWindowInteractor id0,vtkCallbackCommand id1,float id2)
  {
    AddEventsToInteractor_21(id0,id1,id2);
  }

  public vtkWidgetEventTranslator() { super(); }

  public vtkWidgetEventTranslator(long id) { super(id); }
  public native long   VTKInit();

}
