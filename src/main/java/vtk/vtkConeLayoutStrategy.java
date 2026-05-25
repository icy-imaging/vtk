// java wrapper for vtkConeLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConeLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native void SetCompactness_4(float id0);
  public void SetCompactness(float id0)
  {
    SetCompactness_4(id0);
  }

  private native float GetCompactness_5();
  public float GetCompactness()
  {
    return GetCompactness_5();
  }

  private native void SetCompression_6(int id0);
  public void SetCompression(int id0)
  {
    SetCompression_6(id0);
  }

  private native int GetCompression_7();
  public int GetCompression()
  {
    return GetCompression_7();
  }

  private native void CompressionOn_8();
  public void CompressionOn()
  {
    CompressionOn_8();
  }

  private native void CompressionOff_9();
  public void CompressionOff()
  {
    CompressionOff_9();
  }

  private native void SetSpacing_10(float id0);
  public void SetSpacing(float id0)
  {
    SetSpacing_10(id0);
  }

  private native float GetSpacing_11();
  public float GetSpacing()
  {
    return GetSpacing_11();
  }

  private native void Layout_12();
  public void Layout()
  {
    Layout_12();
  }

  public vtkConeLayoutStrategy() { super(); }

  public vtkConeLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
