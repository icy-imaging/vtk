// java wrapper for vtkImageItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageItem extends vtkContextItem
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native void SetImage_5(vtkImageData id0);
  public void SetImage(vtkImageData id0)
  {
    SetImage_5(id0);
  }

  private native long GetImage_6();
  public vtkImageData GetImage()
  {
    long temp = GetImage_6();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPosition_7(float id0,float id1);
  public void SetPosition(float id0,float id1)
  {
    SetPosition_7(id0,id1);
  }

  private native void SetPosition_8(float id0[]);
  public void SetPosition(float id0[])
  {
    SetPosition_8(id0);
  }

  private native float[] GetPosition_9();
  public float[] GetPosition()
  {
    return GetPosition_9();
  }

  public vtkImageItem() { super(); }

  public vtkImageItem(long id) { super(id); }
  public native long   VTKInit();

}
