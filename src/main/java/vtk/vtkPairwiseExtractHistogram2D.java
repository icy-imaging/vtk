// java wrapper for vtkPairwiseExtractHistogram2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPairwiseExtractHistogram2D extends vtkStatisticsAlgorithm
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

  private native void SetNumberOfBins_4(int id0,int id1);
  public void SetNumberOfBins(int id0,int id1)
  {
    SetNumberOfBins_4(id0,id1);
  }

  private native void SetNumberOfBins_5(int id0[]);
  public void SetNumberOfBins(int id0[])
  {
    SetNumberOfBins_5(id0);
  }

  private native int[] GetNumberOfBins_6();
  public int[] GetNumberOfBins()
  {
    return GetNumberOfBins_6();
  }

  private native void SetCustomColumnRangeIndex_7(int id0);
  public void SetCustomColumnRangeIndex(int id0)
  {
    SetCustomColumnRangeIndex_7(id0);
  }

  private native void SetCustomColumnRangeByIndex_8(double id0,double id1);
  public void SetCustomColumnRangeByIndex(double id0,double id1)
  {
    SetCustomColumnRangeByIndex_8(id0,id1);
  }

  private native void SetCustomColumnRange_9(int id0,double id1[]);
  public void SetCustomColumnRange(int id0,double id1[])
  {
    SetCustomColumnRange_9(id0,id1);
  }

  private native void SetCustomColumnRange_10(int id0,double id1,double id2);
  public void SetCustomColumnRange(int id0,double id1,double id2)
  {
    SetCustomColumnRange_10(id0,id1,id2);
  }

  private native void SetScalarType_11(int id0);
  public void SetScalarType(int id0)
  {
    SetScalarType_11(id0);
  }

  private native void SetScalarTypeToUnsignedInt_12();
  public void SetScalarTypeToUnsignedInt()
  {
    SetScalarTypeToUnsignedInt_12();
  }

  private native void SetScalarTypeToUnsignedLong_13();
  public void SetScalarTypeToUnsignedLong()
  {
    SetScalarTypeToUnsignedLong_13();
  }

  private native void SetScalarTypeToUnsignedShort_14();
  public void SetScalarTypeToUnsignedShort()
  {
    SetScalarTypeToUnsignedShort_14();
  }

  private native void SetScalarTypeToUnsignedChar_15();
  public void SetScalarTypeToUnsignedChar()
  {
    SetScalarTypeToUnsignedChar_15();
  }

  private native int GetScalarType_16();
  public int GetScalarType()
  {
    return GetScalarType_16();
  }

  private native double GetMaximumBinCount_17(int id0);
  public double GetMaximumBinCount(int id0)
  {
    return GetMaximumBinCount_17(id0);
  }

  private native double GetMaximumBinCount_18();
  public double GetMaximumBinCount()
  {
    return GetMaximumBinCount_18();
  }

  private native int GetBinRange_19(int id0,long id1,long id2,double id3[]);
  public int GetBinRange(int id0,long id1,long id2,double id3[])
  {
    return GetBinRange_19(id0,id1,id2,id3);
  }

  private native int GetBinRange_20(int id0,long id1,double id2[]);
  public int GetBinRange(int id0,long id1,double id2[])
  {
    return GetBinRange_20(id0,id1,id2);
  }

  private native void GetBinWidth_21(int id0,double id1[]);
  public void GetBinWidth(int id0,double id1[])
  {
    GetBinWidth_21(id0,id1);
  }

  private native long GetOutputHistogramImage_22(int id0);
  public vtkImageData GetOutputHistogramImage(int id0)
  {
    long temp = GetOutputHistogramImage_22(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHistogramFilter_23(int id0);
  public vtkExtractHistogram2D GetHistogramFilter(int id0)
  {
    long temp = GetHistogramFilter_23(id0);

    if (temp == 0) return null;
    return (vtkExtractHistogram2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Aggregate_24(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1);
  public void Aggregate(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1)
  {
    Aggregate_24(id0,id1);
  }

  public vtkPairwiseExtractHistogram2D() { super(); }

  public vtkPairwiseExtractHistogram2D(long id) { super(id); }
  public native long   VTKInit();

}
