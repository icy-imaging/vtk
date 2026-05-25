// java wrapper for vtkTextMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextMapper extends vtkMapper2D
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

  private native void GetSize_4(vtkViewport id0,int id1[]);
  public void GetSize(vtkViewport id0,int id1[])
  {
    GetSize_4(id0,id1);
  }

  private native int GetWidth_5(vtkViewport id0);
  public int GetWidth(vtkViewport id0)
  {
    return GetWidth_5(id0);
  }

  private native int GetHeight_6(vtkViewport id0);
  public int GetHeight(vtkViewport id0)
  {
    return GetHeight_6(id0);
  }

  private native void SetInput_7(byte[] id0, int len0);
  public void SetInput(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInput_7(bytes0, bytes0.length);
  }

  private native byte[] GetInput_8();
  public String GetInput()
  {
    return new String(GetInput_8(), StandardCharsets.UTF_8);
  }

  private native void SetTextProperty_9(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_9(id0);
  }

  private native long GetTextProperty_10();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_10();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_11(vtkAbstractMapper id0);
  public void ShallowCopy(vtkAbstractMapper id0)
  {
    ShallowCopy_11(id0);
  }

  private native int SetConstrainedFontSize_12(vtkViewport id0,int id1,int id2);
  public int SetConstrainedFontSize(vtkViewport id0,int id1,int id2)
  {
    return SetConstrainedFontSize_12(id0,id1,id2);
  }

  private native int SetConstrainedFontSize_13(vtkTextMapper id0,vtkViewport id1,int id2,int id3);
  public int SetConstrainedFontSize(vtkTextMapper id0,vtkViewport id1,int id2,int id3)
  {
    return SetConstrainedFontSize_13(id0,id1,id2,id3);
  }

  private native void RenderOverlay_14(vtkViewport id0,vtkActor2D id1);
  public void RenderOverlay(vtkViewport id0,vtkActor2D id1)
  {
    RenderOverlay_14(id0,id1);
  }

  private native void ReleaseGraphicsResources_15(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_15(id0);
  }

  private native long GetMTime_16();
  public long GetMTime()
  {
    return GetMTime_16();
  }

  public vtkTextMapper() { super(); }

  public vtkTextMapper(long id) { super(id); }
  public native long   VTKInit();

}
