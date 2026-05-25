// java wrapper for vtkLabelRenderStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabelRenderStrategy extends vtkObject
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

  private native boolean SupportsRotation_4();
  public boolean SupportsRotation()
  {
    return SupportsRotation_4();
  }

  private native boolean SupportsBoundedSize_5();
  public boolean SupportsBoundedSize()
  {
    return SupportsBoundedSize_5();
  }

  private native void SetRenderer_6(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_6(id0);
  }

  private native long GetRenderer_7();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_7();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDefaultTextProperty_8(vtkTextProperty id0);
  public void SetDefaultTextProperty(vtkTextProperty id0)
  {
    SetDefaultTextProperty_8(id0);
  }

  private native long GetDefaultTextProperty_9();
  public vtkTextProperty GetDefaultTextProperty()
  {
    long temp = GetDefaultTextProperty_9();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ComputeLabelBounds_10(vtkTextProperty id0,byte[] id1, int len1,double id2[]);
  public void ComputeLabelBounds(vtkTextProperty id0,String id1,double id2[])
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    ComputeLabelBounds_10(id0,bytes1, bytes1.length,id2);
  }

  private native void RenderLabel_11(int id0[],vtkTextProperty id1,byte[] id2, int len2);
  public void RenderLabel(int id0[],vtkTextProperty id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    RenderLabel_11(id0,id1,bytes2, bytes2.length);
  }

  private native void RenderLabel_12(int id0[],vtkTextProperty id1,byte[] id2, int len2,int id3);
  public void RenderLabel(int id0[],vtkTextProperty id1,String id2,int id3)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    RenderLabel_12(id0,id1,bytes2, bytes2.length,id3);
  }

  private native void StartFrame_13();
  public void StartFrame()
  {
    StartFrame_13();
  }

  private native void EndFrame_14();
  public void EndFrame()
  {
    EndFrame_14();
  }

  private native void ReleaseGraphicsResources_15(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_15(id0);
  }

  public vtkLabelRenderStrategy() { super(); }

  public vtkLabelRenderStrategy(long id) { super(id); }

}
