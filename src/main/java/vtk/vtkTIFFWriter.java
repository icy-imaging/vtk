// java wrapper for vtkTIFFWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTIFFWriter extends vtkImageWriter
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

  private native void Write_4();
  public void Write()
  {
    Write_4();
  }

  private native void SetCompression_5(int id0);
  public void SetCompression(int id0)
  {
    SetCompression_5(id0);
  }

  private native int GetCompressionMinValue_6();
  public int GetCompressionMinValue()
  {
    return GetCompressionMinValue_6();
  }

  private native int GetCompressionMaxValue_7();
  public int GetCompressionMaxValue()
  {
    return GetCompressionMaxValue_7();
  }

  private native int GetCompression_8();
  public int GetCompression()
  {
    return GetCompression_8();
  }

  private native void SetCompressionToNoCompression_9();
  public void SetCompressionToNoCompression()
  {
    SetCompressionToNoCompression_9();
  }

  private native void SetCompressionToPackBits_10();
  public void SetCompressionToPackBits()
  {
    SetCompressionToPackBits_10();
  }

  private native void SetCompressionToJPEG_11();
  public void SetCompressionToJPEG()
  {
    SetCompressionToJPEG_11();
  }

  private native void SetCompressionToDeflate_12();
  public void SetCompressionToDeflate()
  {
    SetCompressionToDeflate_12();
  }

  private native void SetCompressionToLZW_13();
  public void SetCompressionToLZW()
  {
    SetCompressionToLZW_13();
  }

  public vtkTIFFWriter() { super(); }

  public vtkTIFFWriter(long id) { super(id); }
  public native long   VTKInit();

}
