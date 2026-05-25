// java wrapper for vtkTriangularTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTriangularTexture extends vtkImageAlgorithm
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

  private native void SetScaleFactor_4(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_4(id0);
  }

  private native double GetScaleFactor_5();
  public double GetScaleFactor()
  {
    return GetScaleFactor_5();
  }

  private native void SetXSize_6(int id0);
  public void SetXSize(int id0)
  {
    SetXSize_6(id0);
  }

  private native int GetXSize_7();
  public int GetXSize()
  {
    return GetXSize_7();
  }

  private native void SetYSize_8(int id0);
  public void SetYSize(int id0)
  {
    SetYSize_8(id0);
  }

  private native int GetYSize_9();
  public int GetYSize()
  {
    return GetYSize_9();
  }

  private native void SetTexturePattern_10(int id0);
  public void SetTexturePattern(int id0)
  {
    SetTexturePattern_10(id0);
  }

  private native int GetTexturePatternMinValue_11();
  public int GetTexturePatternMinValue()
  {
    return GetTexturePatternMinValue_11();
  }

  private native int GetTexturePatternMaxValue_12();
  public int GetTexturePatternMaxValue()
  {
    return GetTexturePatternMaxValue_12();
  }

  private native int GetTexturePattern_13();
  public int GetTexturePattern()
  {
    return GetTexturePattern_13();
  }

  public vtkTriangularTexture() { super(); }

  public vtkTriangularTexture(long id) { super(id); }
  public native long   VTKInit();

}
