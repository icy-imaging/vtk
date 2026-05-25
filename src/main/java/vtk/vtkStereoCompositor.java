// java wrapper for vtkStereoCompositor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStereoCompositor extends vtkObject
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

  private native boolean RedBlue_4(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1);
  public boolean RedBlue(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1)
  {
    return RedBlue_4(id0,id1);
  }

  private native boolean Anaglyph_5(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,float id2,int id3[]);
  public boolean Anaglyph(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,float id2,int id3[])
  {
    return Anaglyph_5(id0,id1,id2,id3);
  }

  private native boolean Interlaced_6(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,int id2[]);
  public boolean Interlaced(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,int id2[])
  {
    return Interlaced_6(id0,id1,id2);
  }

  private native boolean Dresden_7(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,int id2[]);
  public boolean Dresden(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,int id2[])
  {
    return Dresden_7(id0,id1,id2);
  }

  private native boolean Checkerboard_8(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,int id2[]);
  public boolean Checkerboard(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,int id2[])
  {
    return Checkerboard_8(id0,id1,id2);
  }

  private native boolean SplitViewportHorizontal_9(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,int id2[]);
  public boolean SplitViewportHorizontal(vtkUnsignedCharArray id0,vtkUnsignedCharArray id1,int id2[])
  {
    return SplitViewportHorizontal_9(id0,id1,id2);
  }

  public vtkStereoCompositor() { super(); }

  public vtkStereoCompositor(long id) { super(id); }
  public native long   VTKInit();

}
